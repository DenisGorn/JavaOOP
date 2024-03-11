package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import view.StudentGroupView;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup = new StudentGroup();
    private int studentGroupId = 0;
    public void createStudentGroup(Teacher teacher, List<Student> studentList) {
        studentGroup.getGroupId(++studentGroupId);
        studentGroup.getTeacher(teacher);
        studentGroup.getStudentList(studentList);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }


}
