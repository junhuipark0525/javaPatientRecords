//Junhui Park
//October 7, 2024
//AP CSA 7th
//Patient Chart Main

package junhui.seven;

public class Main {
    public static void main(String[] args) { 
        //new patient
        PatientChart patient1 = new PatientChart();
        //setting values for all fields
        patient1.setPatientFirstName("John");
        patient1.setPatientLastName("Doe");
        patient1.setPatientAge(26); 
        patient1.setPatient4SSN(2931);
        patient1.setBodyTemp(99.2); 
        patient1.setIsInsured(true); 
        patient1.setBloodType("RH A+");
        patient1.setGender("Male");
        patient1.setSymptom("Extreme stomachache, vomit");

        //display patient1
        patient1.displayPatients();

        //using interface to edit first name, last name, age, and SSN 
        patient1.editPatientFirstName(""); //invalid string -> error statement + go back to default
        patient1.editPatientLastName("Park");
        patient1.editPatientAge(-17); //invalid age -> print error statement + go back to default value
        patient1.editPatientSSN(-2032); //invalid SSN -> error statement + go back to default 

        //print(display) patient1 chart
        System.out.println(patient1);

        //new patient
        PatientChart patient2 = new PatientChart();
        //using abstract to add values to patient first name, last name, age, SSN, blood type, and body temp 
        patient2.addPatient("Adams", "John");
        patient2.addAge(57);
        patient2.addIdentification(5826);
        patient2.addBloodType("RH AB+");
        patient2.addBodyTemp(100.2);
        //setter for fields introduced in concrete class
        patient2.setGender("Male");
        patient2.setSymptom("Nausea, Dizziness");
        patient2.setIsInsured(false);

        //display patient2
        patient2.displayPatients();

        //using interface to edit the fields 
        patient2.editPatientFirstName("Kaylin");
        patient2.editPatientLastName("Lee");
        patient2.editPatientSSN(7821);
        patient2.editPatientAge(17);
        //setter to change the gender 
        patient2.setGender("Female");
        
        //print patient2 chart
        System.out.println(patient2);

    }
}