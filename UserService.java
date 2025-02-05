import java.util.*;
public interface UserService {
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    Optional<String> getUser(String name);

    static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        
        System.out.println(userService.getUser("Pooja").orElseGet(userService::getWelcomeMessage));
        System.out.println(userService.getUser(null).orElseGet(userService::getWelcomeMessage));
    }
}

class UserServiceImpl implements UserService {
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name)
        .map(n -> "Welcome, " + n + "!");
    }
}
