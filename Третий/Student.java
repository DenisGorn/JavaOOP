public class Student implements Comparable<Student>{
    public Integer studentId;
    public String firstName;
    public String middleName;
    public String lastName;

    public Student(Integer studentId, String firstName, String middleName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return studentId.compareTo(o.studentId);

//        if(studentId > o.studentId)
//            return 1;
//        if(studentId < o.studentId)
//            return -1;
//        return 0;

    }
}
