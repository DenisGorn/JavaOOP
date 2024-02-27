public class Student extends User implements Comparable<Student>{
    private Integer studentId;


    public Student(Integer studentId, String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
        this.studentId = studentId;

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", middleName='" + super.getMiddleName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
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
