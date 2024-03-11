package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, TypeUser type) {
        int id = getFreeId(type);
        if (type == TypeUser.STUDENT)
            users.add(new Student(firstName, secondName, lastName, id));
        else if (type == TypeUser.TEACHER)
            users.add(new Teacher(firstName, secondName, lastName, id));
    }



    public User getUserById(TypeUser type, Integer id){
        boolean isTeacher = type == TypeUser.TEACHER;
        for (User user:users) {
            if (isTeacher && user instanceof Teacher && ((Teacher)user).getTeacherId() == id){
                return user;
            }
            if (!isTeacher && user instanceof Student && ((Student)user).getStudentId() == id){
                return user;
            }
        }
        return null;
    }

    private int getFreeId(TypeUser typeUser) {
        for (int i = users.size() - 1; i >= 0; i--) {
            User user = users.get(i);
            if (user instanceof Student && typeUser == TypeUser.STUDENT)
                return ((Student) user).getStudentId() + 1;
            if (user instanceof Teacher && typeUser == TypeUser.TEACHER)
                return ((Teacher) user).getTeacherId() + 1;
        }
        return 1;
    }

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student)
                students.add((Student) user);
        }
        return students;
    }
    public List<Teacher> getAllTeacher() {
        List<Teacher> teachers = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher)
                teachers.add((Teacher) user);
        }
        return teachers;
    }
    public StudentGroup createStudentGroup(int teacherForLessonId, List<Integer> studentForLessonId) {
        Teacher studentGroupTeacher = null;
        List<Student> studentListGroup = new ArrayList<>();

        //поиск учителя
        for (User user : users) {
            if (user instanceof Teacher && ((Teacher) user).getTeacherId() == teacherForLessonId)
                studentGroupTeacher = (Teacher) user;
        }
        //поиск студенов
        for (User user : users) {
            for (Integer i : studentForLessonId) {
                if (user instanceof Student && ((Student) user).getStudentId().equals(i))
                    studentListGroup.add((Student) user);
            }
        }
        return new StudentGroup(studentGroupTeacher, studentListGroup);
    }
}
