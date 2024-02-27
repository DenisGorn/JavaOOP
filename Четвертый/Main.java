import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        Student student1 = new Student(4, "aab", "aaa", "Aaa");
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
        */
        Teacher teacher1 = new Teacher(4, "aab", "aaa", "Aaa");
        Teacher teacher2 = new Teacher(2, "aaa", "aaa", "Aaa");
        Teacher teacher3 = new Teacher(3, "Aaa", "aaa", "Aaa");
        Teacher teacher4 = new Teacher(1, "bbb", "bbb", "Aaa");
        List<Teacher> teacherList = new ArrayList<>();
        TeachersGroup teacherGroup = new TeachersGroup(teacherList);
        teacherGroup.addTeacher(teacher1);
        teacherGroup.addTeacher(teacher2);
        teacherGroup.addTeacher(teacher3);
        teacherGroup.addTeacher(teacher4);

        TeacherService service = new TeacherService(teacherGroup);
        UserView<Teacher> view = new TeacherView();
        view.sendOnConsole(service.getSortedStudentGroupByFIO());





    }
}
