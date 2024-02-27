import java.util.Iterator;
import java.util.List;

public class TeachersGroup implements Iterable<Teacher>{
    static List<Teacher> teachersList;

    public TeachersGroup(List<Teacher> teachersList) {
        TeachersGroup.teachersList = teachersList;
    }
    public void addTeacher(Teacher teacher) {teachersList.add(teacher);}

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }


}
