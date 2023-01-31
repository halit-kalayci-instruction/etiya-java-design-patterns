package behavioral.chain_of_responsibility2;

public class UserExistsMiddleware extends Middleware{
    private UserRepository userRepository;

    public UserExistsMiddleware(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean check(String email, String password) {

        boolean isExists = userRepository.hasEmail(email);
        if(!isExists){
            System.out.println("Böyle bir kullanıcı bulunamadı!");
            return false;
        }
        return checkNext(email,password);
    }
}
