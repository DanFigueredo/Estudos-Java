package JavaExercises;

import JavaExercises.Domain.Appointment;
import JavaExercises.Domain.Doctor;
import JavaExercises.Domain.Patient;

import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Appointment[] appointments = new Appointment[10];

        int totalAppointment =0;
        int option;



        while(true){
            System.out.println("1 - Schedule Appointment");
            System.out.println("2 - List Appointments");
            System.out.println("3 - Cancel Appointment");
            System.out.println("4 - Finish Appointment");
            System.out.println("5 - Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option <=0 || option > 5){
                System.out.println("Invalid option!");
                continue;
            }

            if (option == 1){
                Appointment appointment = new Appointment();
                Patient patient = new Patient();
                Doctor doctor = new Doctor();
                System.out.print("Patient name: ");
                patient.setName(scanner.nextLine());

                System.out.print("Patient CPF: ");
                patient.setCpf(scanner.nextLine());

                if (patient.getCpf().length() != 11){
                    System.out.println("Invalid CPF!");
                    continue;
                }

                System.out.print("Doctor name: ");
                doctor.setName(scanner.nextLine());

                System.out.print("Doctor specialty: ");
                doctor.setSpecialty(scanner.nextLine());

                System.out.print("Which date: ");
                appointment.setDate(scanner.nextLine());

                System.out.print("Which hour: ");
                appointment.setHour(scanner.nextLine());

                appointment.setStatus("Scheduled");

                appointment.setPatient(patient);
                appointment.setDoctor(doctor);

                appointments[totalAppointment] = appointment;
                totalAppointment++;

            }

            if (option == 2){
                for (int i = 0; i < totalAppointment; i++){
                    appointments[i].showData();
                }

            }

            if (option == 3){
                int choose;
                System.out.print("Wich of the " + totalAppointment + " appointments do you cancel? ");
                choose = scanner.nextInt();
                scanner.nextLine();
                if (choose < 0 || choose >= totalAppointment){
                    System.out.println("Invalid option!");
                    continue;
                }
                choose--;
                appointments[choose].setStatus("Canceled");
            }

            if (option == 4){
                int choose;
                System.out.print("Wich of the " + totalAppointment + " appointments do you want finish? ");
                choose = scanner.nextInt();
                if (choose < 0 || choose >= totalAppointment){
                    System.out.println("Invalid option!");
                    continue;
                }
                choose--;

                appointments[choose].setStatus("Finished");
            }

            if (option == 5){
                System.out.println("Program completed");
                break;
            }
        }//end while
    }
}
