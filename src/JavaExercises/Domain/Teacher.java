package JavaExercises.Domain;

public class Teacher extends Person {
    private String subject;
    private String name;
    private int age;

    public Teacher(String subject, int age, String name) {
        this.subject = subject;
        super(name, age);
    }

    @Override
    public void showData(){
        super.showData();
        System.out.println("Subject: " + subject);

    }
}

