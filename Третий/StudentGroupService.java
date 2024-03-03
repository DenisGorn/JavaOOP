import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public List<Student> getSortedStudentGroup() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentGroupByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
//        Collections.sort(studentList, new StudentComparator());
        studentList.sort(new StudentComparator());
        return studentList;
        }
    }

