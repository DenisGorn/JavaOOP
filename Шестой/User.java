/*
1. SRP:
Класс User выполняет только одну задачу хранит минимальные данные пользователя - ФИО, значит соответствует приципу
единственной ответственности.
2. OCP:
класс User можно расширить без изменения его исходного кода, например наследниками Student и Teacher, значит данный класс
соответствует приципу открытости/закрытости.
3. LSP:
производные от User классы Teacher и Student имеют ФИО и могут быть использованы вместо него без нарушения корректности
программы и не изменяют поведение класса User, значит данный класс соответствует приципу подстановки Барбары Лисков.
4. ISP:
Класс User содержат только необходимые методы, которые используются для реализации хранения информации о пользователе,
значит данный класс соответствует приципу разделения интерфейса.
5. DIP:
Класс User не зависит ни от одного класса, значит класс соответствует приципу инверсии зависимостей.
 */
public class User {
    private String firstName;
    private String middleName;
    private String lastName;

    public User(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
