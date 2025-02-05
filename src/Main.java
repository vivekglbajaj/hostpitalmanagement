import Models.Appontment;
import Models.Doctor;
import Models.Patients;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("John Smith", "Cardiology");
        Patients patient = new Patients("Alice Brown", 30);

        Appontment appointment = new Appontment(doctor, patient);
        appointment.Schedul();

        patient.getTreetment(doctor);

    }
}