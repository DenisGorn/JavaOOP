package controller;

import model.Student;
import model.Teacher;
import model.TypeUser;
import service.DataService;
import service.StudentGroupService;
import view.StudentGroupView;
import view.StudentView;
import view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudentView studentView = new StudentView();
    TeacherView teacherView = new TeacherView();
    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, TypeUser.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, TypeUser.STUDENT);
    }

    public void getAllStudent() {
        studentView.printOnConsoleArr(dataService.getAllStudent());
    }
    public void getAllTeacher() {
        teacherView.printOnConsoleArr(dataService.getAllTeacher());
    }

    StudentGroupView studentGroupView = new StudentGroupView();
    StudentGroupService studentGroupService = new StudentGroupService();
    public void createStudentGroup(int teacherId, List<Integer> studentIdList) {
        Teacher teacher = (Teacher) dataService.getUserById(TypeUser.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (int id : studentIdList)
            studentList.add((Student)dataService.getUserById(TypeUser.STUDENT, id));
        studentGroupService.createStudentGroup(teacher, studentList);
    }
    public void printStudentGroup() {
        studentGroupView.printOnConsole(studentGroupService.getStudentGroup());
    }
}
