import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroupList;

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }



    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public void addStudentGroup(StudentGroup StudentGroup) {
        studentGroupList.add(StudentGroup);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "studentGroupList=" + studentGroupList +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroupList.iterator();
    }


    }

