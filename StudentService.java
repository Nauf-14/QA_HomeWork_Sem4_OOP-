package QA_HomeWork_Sem4_OOP;


import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private List<Student> students;

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void initData(List<Student> list) {
        students = new ArrayList<>(list);
    }

    @Override
    public void create(Student student) {
        students.add(student);
    }
}

