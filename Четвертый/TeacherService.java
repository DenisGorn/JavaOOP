import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    TeachersGroup teachersGroup;

    public TeacherService(TeachersGroup teachersGroup) {
        this.teachersGroup = teachersGroup;
    }
    public List<Teacher> teachersList = new ArrayList<>();
    public List<Teacher> getSortedStudentGroupByFIO() {
        List<Teacher> teacherList = new ArrayList<>(TeachersGroup.teachersList);
        teacherList.sort(new UserComparator<Teacher>());
            return teacherList;
    }
}
