package behavioral.chain_of_responsibility2;

public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if(email.equalsIgnoreCase("admin@admin.com")){
            System.out.println("Hello, admin!");
            return true;
        }
        return checkNext(email,password);
    }
}
