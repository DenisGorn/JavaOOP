import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    TeachersGroup teachersGroup;

    public TeacherService(TeachersGroup teachersGroup) {
        this.teachersGroup = teachersGroup;
    }
    public List<Teacher> teachersList = new ArrayList<>();
    public List<Teacher> getSortedTeacherGroupByFIO() {
        List<Teacher> teacherList = new ArrayList<>(TeachersGroup.teachersList);
        teacherList.sort(new UserComparator<Teacher>());
            return teacherList;
    }
}
