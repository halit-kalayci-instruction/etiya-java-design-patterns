package structural.proxy.services;

public class ExampleService implements IExampleService{
    @Override
    public int getData(int number) {
        // Simülasyon: süre alan bir işlem..
        int total = 0;
        for(int i=0; i<number; i++){
            total += i;
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
        return total;
    }
}
// 50 => 1050
// 50 => 1050
// 50 => 1050

// param:50 => result:1050
