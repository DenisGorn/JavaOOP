package view;

import model.Student;
import model.Teacher;

import java.util.List;

public class TeacherView implements IUserView<Teacher>{

    @Override
    public void printOnConsole(Teacher user) {
        System.out.println(user);
    }

    @Override
    public void printOnConsoleArr(List<Teacher> users) {
        for (Teacher teacher : users) {
            System.out.println(teacher);
        }

    }
}
