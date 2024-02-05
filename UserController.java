package QA_HomeWork_Sem4_OOP;



import java.util.List;

public class UserController<T extends User> {
    private final UserService<T> userService;

    public UserController(UserService<T> userService) {
        this.userService = userService;
    }

    public List<T> getAllUsers() {
        return userService.getAll();
    }

    public void initData(List<T> list) {
        userService.initData(list);
    }

    public void createUser(T user) {
        userService.create(user);
    }
}

