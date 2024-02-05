package QA_HomeWork_Sem4_OOP;

import java.util.List;

public interface UserService<T extends User> {
    List<T> getAll();
    void initData(List<T> list);
    void create(T user);
}

