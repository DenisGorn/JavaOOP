import controller.Controller;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1","1","1");
        controller.createStudent("2","2","2");
        controller.getAllStudent();
        controller.createStudent("3","3","3");
        controller.createStudent("4","4","4");
        controller.getAllStudent();
        controller.createTeacher("Teacher1", "-", "Teacher1");
        controller.getAllTeacher();

        List<Integer> students = List.of(1,2,3,4,5);

        controller.createStudentGroup(1, students);
        controller.printStudentGroup();






    }
}
