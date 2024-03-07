/*
Класс в целом соответствует принципам SOLID:
выполняет одну задачу, его можно расширить, содержит только необходимые методы
 */

import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student st : list)
            System.out.println(st);
    }
}
