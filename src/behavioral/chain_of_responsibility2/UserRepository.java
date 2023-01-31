package behavioral.chain_of_responsibility2;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String,String> users = new HashMap<>();

    private Middleware middleware;
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public void register(String email, String password){
        users.put(email,password);
    }
    public boolean hasEmail(String email){
        return users.containsKey(email);
    }
    public boolean login(String email, String password){
        if(this.middleware.check(email,password) && users.get(email).equals(password)){
            System.out.println("Authorized");
            return true;
        }
        return false;
    }
}
