import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    List<Student> studentList;
    String studentGroupId;
    Integer numberOfStudent;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }
    public StudentGroup(String studentGroupId, int numberOfStudent) {
        this.studentGroupId = studentGroupId;
        this.numberOfStudent = numberOfStudent;
    }


    public void addStudent(Student student) {
        studentList.add(student);
    }


    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentGroupId='" + studentGroupId + '\'' +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public int compareTo(StudentGroup o) {
        return studentGroupId.compareTo(o.studentGroupId);

    }
}
