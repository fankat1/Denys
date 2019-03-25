
package main;

import institution.University;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.setStudent(new Student("Andrew Kostenko", new Knowledge(74)));
        university.setStudent(new Student("Julia Veselkina", new Knowledge(66)));
        university.setStudent(new Student("Maria Perechrest", new Knowledge(81)));
        university.setStudent(new Student("Maria Perechrest", new Knowledge(92)));
        university.setStudent(new Student("Maria Perechrest", new Knowledge(47)));

        Student denysPidhornyi = new Student("Denys Pidhornyi", new Knowledge(98));
        university.setStudent(denysPidhornyi);


        boolean omWasAdded = university.addStudentToInternship(denysPidhornyi);
        System.out.println("Was Den added? " + omWasAdded);

        System.out.println("Students on internship:");
        System.out.println(university.getInternship().getStudents());

    }
}