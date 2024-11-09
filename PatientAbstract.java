//Junhui Park
//October 7, 2024
//AP CSA 7th
//Patient Chart Abstract Class

package junhui.seven;

public abstract class PatientAbstract {
    //other classes can see it when you use protected
    //defining fields 
    protected String patientLastName;
    protected String patientFirstName;
    protected int patient4SSN;
    protected int patientAge;
    protected double bodyTemp;
    protected String bloodType;

    //abstract class to add patient, SSN, age, body temp, blood type
    //extended in concrete class and further defined on what each should do
    public abstract boolean addPatient(String patientLastName, String patientFirstName);
    public abstract boolean addIdentification(int patient4SSN);
    public abstract boolean addAge(int patientAge);
    public abstract boolean addBodyTemp(double bodyTemp);
    public abstract boolean addBloodType(String bloodType);
}
