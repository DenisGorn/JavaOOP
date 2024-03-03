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
        StudentGroup studentGroup1 = new StudentGroup("1", 10);
        StudentGroup studentGroup2 = new StudentGroup("2", 23);
        StudentGroup studentGroup3 = new StudentGroup("3", 11);
        StudentGroup studentGroup4 = new StudentGroup("4", 7);
        StudentGroup studentGroup5 = new StudentGroup("5", 17);

        List<StudentGroup> studentGroupList = new ArrayList<>();

        Stream stream = new Stream(studentGroupList);
        stream.addStudentGroup(studentGroup1);
        stream.addStudentGroup(studentGroup2);
        stream.addStudentGroup(studentGroup3);
        stream.addStudentGroup(studentGroup4);
        stream.addStudentGroup(studentGroup5);

        StreamService streamService = new StreamService(stream);
        for (StudentGroup stGr : stream) {
            System.out.println(stGr);
        }
        System.out.println("Сортировка по Id:");


        for(StudentGroup st : streamService.getSortedGroup()) {
            System.out.println(st);
        }
        System.out.println("Сортировка по количеству студентов:");


        for(StudentGroup st : streamService.getSortedGroupBySize()) {
            System.out.println(st);
        }


/*        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student st : studentGroup.studentList)
            System.out.println(st);
        System.out.println();
        for (Student st : service.getSortedStudentGroup())
            System.out.println(st);

        System.out.println();
        for (Student st : service.getSortedStudentGroupByFIO())
            System.out.println(st);

 //       for (Student student : studentGroup) {
    //        System.out.println(student);
   //     }





    }

         */
}

}