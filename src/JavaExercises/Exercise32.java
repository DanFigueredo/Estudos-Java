package JavaExercises;

import JavaExercises.Domain.Person;
import JavaExercises.Domain.Student;
import JavaExercises.Domain.Teacher;

public class Exercise32 {
    public static void main(String[] args) {
        Person student = new Student("Ads", 19, "Daniel");
        student.showData();

        Person teacher = new Teacher("Mathematics", 45, "Rodolfo");
        teacher.showData();
    }
}
