package JavaExercises.Domain;

public class Student extends Person{
    private String course;
    private String name;
    private int age;

    public Student(String course, int age, String name) {
        this.course = course;
        super(name, age);
    }

    @Override
    public void showData(){
        super.showData();
        System.out.println("Course: " + course);

    }
}
