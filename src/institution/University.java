package institution;

import institution.interlink.Internship;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private Internship internship;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        students = new ArrayList<>();
        internship = new Internship("InternshipName");
    }

    public void setStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentAverageScore() {
        int scoresAddUp = 0;
        for(Student s : students) {
            scoresAddUp += s.getKnowledge().getScore();
        }

        return scoresAddUp/students.size();
    }

    /**
     * Adds students to university internship
     * @return true is student was added, else false
     */
    public boolean addStudentToInternship(Student candidate) {

        //check if candidate is student of University
        if (!students.contains(candidate))
            return false;

        if (candidate.getKnowledge().getScore() > getStudentAverageScore()) {
            internship.setStudent(candidate);
            return true;
        }
        return false;
    }

    public Internship getInternship() {
        return internship;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}