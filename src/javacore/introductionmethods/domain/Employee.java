package javacore.introductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salary = new double[3];


    public void printer(){
       System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        for (int i = 0; i < salary.length; i++){
            System.out.println("\nSalary " + (i+1) + ": " + salary[i]);
        }

    }
    public void add(double[] salary)
    {
        double sum = 0.0;
        double average = 0.0;
        int i;
        for ( i = 0; i < salary.length; i++){
            sum += salary[i];

        }
        System.out.println("Sum: "+ sum);
        average = sum / salary.length;
        System.out.println("Average: "+ average);


    }

}
