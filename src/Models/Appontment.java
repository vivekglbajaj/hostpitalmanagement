package Models;

public class Appontment {
    private Doctor doctor;
    private Patients patient;

    public Appontment(Doctor doctor,Patients patient){
        this.doctor = doctor;
        this.patient = patient;
    }
    public void Schedul(){
        System.out.println("Appointment scheduled for " + patient.getName() + " with Dr. " + doctor.getName());

    }
}
