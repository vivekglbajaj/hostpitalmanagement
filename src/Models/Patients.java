package Models;

public class Patients {
    private String name;
    private int age;

    public Patients(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void getTreetment(Doctor doctor){
        System.out.println(name + " (Age: " + age + ") is getting treatment from Dr. " + doctor.getName());
        doctor.diagnosePatient();
    }

    public String getName() {
        return name;
    }
}

