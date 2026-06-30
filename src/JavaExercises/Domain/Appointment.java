package JavaExercises.Domain;

public class Appointment {
        private Patient patient;
        private Doctor doctor;

        private String date;
        private String hour;
        private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void showData() {

        System.out.println("----------- Appointment -----------");
        System.out.println("Patient: " + patient.getName());
        System.out.println("CPF: " + patient.getCpf());

        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Specialty: " + doctor.getSpecialty());

        System.out.println("Date: " + date);
        System.out.println("Hour: " + hour);
        System.out.println("Status: " + status);
    }
}
