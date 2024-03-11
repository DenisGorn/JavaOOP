package model;

import java.util.List;

public class StudentGroup{
    private Teacher studentGroupTeacher;
    private List<Student> studentGroupList;

    public StudentGroup(Teacher studentGroupTeacher, List<Student> studentGroupList) {
        this.studentGroupTeacher = studentGroupTeacher;
        this.studentGroupList = studentGroupList;
    }

    public Teacher getStudentGroupTeacher(Teacher teacher) {
        return this.studentGroupTeacher;
    }

    public List<Student> getStudentGroupList() {
        return this.studentGroupList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher= " + studentGroupTeacher + ",\n" +
                "studentList = " +  studentGroupList +
                "}";
    }
}
