// Создать класс УчительСервис и реализовать аналогично проделанному на семинаре
// Создать класс УчительВью и реализовать аналогично проделанному на семинаре
// Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя
//  отображения списка учителей, имеющихся в системе

package QA_HomeWork_Sem4_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример использования
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();

        UserController<Student> studentController = new UserController<>(studentService);
        UserController<Teacher> teacherController = new UserController<>(teacherService);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Иван", "Иванов"));
        studentList.add(new Student("Петр", "Петров"));

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Сергей", "Сергеев"));
        teacherList.add(new Teacher("Анна", "Аннова"));

        studentController.initData(studentList);
        teacherController.initData(teacherList);

        studentController.createUser(new Student("Новый", "Студент"));
        teacherController.createUser(new Teacher("Новый", "Учитель"));

        System.out.println("Студенты:");
        printUsers(studentController.getAllUsers());

        System.out.println("\nУчителя:");
        printUsers(teacherController.getAllUsers());
    }

    private static void printUsers(List<? extends User> userList) {
        for (User user : userList) {
            System.out.println(user.getFullName());
        }
    }
}

