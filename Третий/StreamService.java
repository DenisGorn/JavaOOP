import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public List<StudentGroup> getSortedGroup() {
        List<StudentGroup> studentGroupList = new ArrayList<>(stream.getStudentGroupList());
        Collections.sort(studentGroupList);
        return studentGroupList;
    }

    public List<StudentGroup> getSortedGroupBySize() {
        List<StudentGroup> studentGroupList = new ArrayList<>(stream.getStudentGroupList());
        studentGroupList.sort(new StreamComparator());
        return studentGroupList;
    }
}
