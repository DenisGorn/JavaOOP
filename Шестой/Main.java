import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Student student1 = new Student(4, "aab", "aaa", "Aaa");
        Student student2 = new Student(2, "aaa", "aaa", "Aaa");
        Student student3 = new Student(3, "Aaa", "aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "Aaa");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        StudentGroupService service = new StudentGroupService(studentGroup);
        UserView<Student> view = new StudentView();
        view.sendOnConsole(service.getSortedStudentGroupByFIO());





    }
}
