//Junhui Park
//October 7, 2024
//AP CSA 7th
//Patient Chart Interface 

package junhui.seven;

public interface IPatientInformation {
    //interface to edit fields
    //implemented in concrete class and further defined on what each should do
    public boolean editPatientFirstName(String patientFirstName);
    public boolean editPatientLastName(String patientLastName);
    public boolean editPatientSSN(int patient4SSN);
    public boolean editPatientAge(int patientAge);
}
