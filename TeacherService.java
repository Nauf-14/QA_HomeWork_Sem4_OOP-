package QA_HomeWork_Sem4_OOP;



import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers;

    @Override
    public List<Teacher> getAll() {
        return new ArrayList<>(teachers);
    }

    @Override
    public void initData(List<Teacher> list) {
        teachers = new ArrayList<>(list);
    }

    @Override
    public void create(Teacher teacher) {
        teachers.add(teacher);
    }
}

