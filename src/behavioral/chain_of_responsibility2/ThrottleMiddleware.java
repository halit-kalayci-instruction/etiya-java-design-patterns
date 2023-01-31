package behavioral.chain_of_responsibility2;

public class ThrottleMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottleMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }
    @Override
    public boolean check(String email, String password) {
        if(System.currentTimeMillis() > currentTime + 60_000){
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if(request > requestPerMinute){
            System.out.println("Request sayısı aşıldı!");
            Thread.currentThread().stop();
        }
        return checkNext(email,password);
    }
}
