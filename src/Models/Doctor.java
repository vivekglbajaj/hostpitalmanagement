package Models;

public class Doctor {
    private String name;
    private String specialization;

    public  Doctor(String name,String specialization){
        this.name = name;
        this.specialization = specialization;
    }
    public void diagnosePatient(){
        System.out.println("Dr. " + name + " (Specialist in " + specialization + ") is diagnosing the patient.");
    }
    public String getName() {
        return name;
    }

}


