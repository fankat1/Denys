package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String name;
    private List<Student> students;


    public Internship(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void setStudent(Student student) {
        this.students.add(student);
    }

    public String getStudents() {
        return students.toString();
    }
}