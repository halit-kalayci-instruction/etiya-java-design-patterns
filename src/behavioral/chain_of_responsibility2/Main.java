package behavioral.chain_of_responsibility2;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        Middleware middleware = Middleware.link(
                new ThrottleMiddleware(2),
                new UserExistsMiddleware(userRepository),
                new RoleCheckMiddleware()
        );

        userRepository.setMiddleware(middleware);
        userRepository.register("halit@kodlama.io","123");
        userRepository.login("halit@kodlama.io","1234");
        userRepository.login("halit@kodlama.io","1234");
        userRepository.login("halit@kodlama.io","1234");
        userRepository.login("halit@kodlama.io","1234");
    }
}
