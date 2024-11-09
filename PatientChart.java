//Junhui Park
//October 7, 2024
//AP CSA 7th
//Patient Chart Concrete Class

package junhui.seven;

public class PatientChart extends PatientAbstract implements IPatientInformation {
    //additional fields in concrete class
    private String gender;
    private String symptom;
    private boolean isInsured;
    
    //Constructor Section
    //Default Constructor 
    public PatientChart() {
        this.patientFirstName = "No First Name Entered";
        this.patientLastName = "No Last Name Entered";
        this.patientAge = 0;
        this.patient4SSN = 0;
        this.gender = "No Gender Entered";
        this.bodyTemp = 0;
        this.bloodType = "No Blood Type Entered";
        this.symptom = "No Symptom Entered";
        this.isInsured = false;
    }

    //Partial Constructor
    public PatientChart(String patientFirstName, int patientAge, double bodyTemp, String symptom) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = "No Last Name Entered";
        this.patientAge = patientAge;
        this.patient4SSN = 0;
        this.gender = "No Gender Entered";
        this.bodyTemp = bodyTemp;
        this.bloodType = "No Blood Type Entered";
        this.symptom = symptom;
        this.isInsured = false;
    }

    //Full Constructor
    public PatientChart(String patientFirstName, String patientLastName, int patientAge, int patient4SSN, String gender, double bodyTemp, String bloodType, String symptom, boolean isInsured) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientAge = patientAge;
        this.patient4SSN = patient4SSN;
        this.gender = gender;
        this.bodyTemp = bodyTemp;
        this.bloodType = bloodType;
        this.symptom = symptom;
        this.isInsured = isInsured;
    }

    //Getter and Setter Section for all fields in abstract, interface, and concrete class
    //protected or private fields
    //first name 
    public String getPatientFirstName() {
        //User Validation goes here
        return this.patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        //User Validation goes here
        this.patientFirstName = patientFirstName;
    }

    //last name
    public String getPatientLastName() {
        //User Validation goes here
        return this.patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        //User Validation goes here
        this.patientLastName = patientLastName;
    }

    //age
    public int getPatientAge() {
        //User Validation goes here
        return this.patientAge;
    }

    public void setPatientAge(int patientAge) {
        //User Validation goes here
        this.patientAge = patientAge;
    }

    //ssn
    public int getPatient4SSN() {
        //User Validation goes here
        return this.patient4SSN;
    }

    public void setPatient4SSN(int patient4SSN) {
        //User Validation goes here
        this.patient4SSN = patient4SSN;
    }

    //body temperature
    public double getBodyTemp() {
        //User Validation goes here
        return this.bodyTemp;
    }

    public void setBodyTemp(double bodyTemp) {
        //User Validation goes here
        this.bodyTemp = bodyTemp;
    }

    //blood type
    public String getBloodType() {
        //User Validation goes here
        return this.bloodType;
    }

    public void setBloodType(String bloodType) {
        //User Validation goes here
        this.bloodType = bloodType;
    }

    //gender
    public String getGender() {
        //User Validation goes here
        return this.gender;
    }

    public void setGender(String gender) {
        //User Validation goes here
        this.gender = gender;
    }

    //symptom
    public String getSymptom() {
        //User Validation goes here
        return this.symptom;
    }

    public void setSymptom(String symptom) {
        //User Validation goes here
        this.symptom = symptom;
    }

    //insurance
    public boolean getIsInsured() {
        //User Validation goes here
        return this.isInsured;
    }

    public void setIsInsured(boolean isInsured) {
        //User Validation goes here
        this.isInsured = isInsured;
    }

    //__________________________
    //extends the abstract class
    @Override
    public boolean addPatient(String patientLastName, String patientFirstName) {
        //try + catch to insert first name and last name
        try {
            //set first name and last name if it passes 
            setPatientFirstName(patientFirstName);
            setPatientLastName(patientLastName);
            //print the results of adding before printing summarized patient chart
            System.out.println("Name Added Succesfully: " + this.patientFirstName + ", " + this.patientLastName);
            return true;
        } catch (Exception e){
            //return false and print error statement if it cannot be inserted 
            System.out.println("Error Inserting Name");
            return false;
        }
    }

    @Override
    public boolean addIdentification(int patient4SSN) {
        //try + catch to insert SSN 
        try {
            //set ssn if it passes try + catch
            setPatient4SSN(patient4SSN);
            //print the result of insert before showing the patient chart to confirm
            System.out.println("SSN Added Successfully: " + this.patient4SSN);
            return true;
        } catch (Exception e){
            //return false and print error statement
            System.out.println("Error Entering SSN");
            return false;
        }
    }

    @Override
    public boolean addAge(int patientAge) {
        //try + catch to insert age 
        try {
            //set patient age if it passes try + catch
            setPatientAge(patientAge);
            //print the result of insert of age before showing the patient chart 
            System.out.println("Age Added Successfully: " + this.patientAge);
            return true;
        } catch (Exception e){
            //return false and print error statement if insert does not work
            System.out.println("Error Entering Age");
            return false;
        }
    }

    @Override
    public boolean addBodyTemp(double bodyTemp) {
        //try + catch to insert body temperature 
        try {
            //set body temperature
            setBodyTemp(bodyTemp);
            //print the result of insertion of temperature before showing patient chart
            System.out.println("Temperature Added Successfully: " + this.bodyTemp);
            return true;
        } catch (Exception e){
            //return false and print error statement if insertion does not work
            System.out.println("Error Entering Temperature");
            return false;
        }
    }

    @Override
    public boolean addBloodType(String bloodType) {
        //try + catch to insert blood type 
        try {
            //set blood type if it works 
            setBloodType(bloodType);
            //print the result of addBloodType before showing patient chart
            System.out.println("Blood Type Added Successfully: " + this.bloodType);
            return true;
        } catch (Exception e){
            //return false and print error statement if insertion doesn't work
            System.out.println("Error Entering Blood Type");
            return false;
        }
    }

    //__________________________
    //implementing the interface

    //editing (replacing) existing value in field for first name
    public boolean editPatientFirstName(String patientFirstName) {
        //cannot edit first name if the string is empty or does not exist
        if (patientFirstName == null || patientFirstName.isEmpty()) {
            //set the first name field back to default
            setPatientFirstName("No First Name Entered");
            //print error statement
            System.out.println("Error: Invalid First Name Entered");
            return false;
        } else {
            //use setter to change the string for first name if string is valid
            setPatientFirstName(patientFirstName);
            //print the result of editPatientFirstName with getter to print the changed string
            System.out.println("Edited Patient First Name: " + getPatientFirstName());
            return true;
        }
    }

    //editing (replacing) existing string in last name 
    public boolean editPatientLastName(String patientLastName) {
        //cannot edit last name if the string is empty or does not exist
        if (patientLastName == null || patientLastName.isEmpty()) {
            //set the last name field back to default
            setPatientLastName("No Last Name Entered");
            //print error statement if last name invalid
            System.out.println("Error: Invalid Last Name Entered");
            return false;
        } else {
            //setter to change the string for last name when string is valid 
            setPatientLastName(patientLastName);
            //print the result of edit before printing patient chart
            System.out.println("Edited Patient Last Name: " + getPatientLastName());
            return true;
        }
    }

    //editing existing age 
    public boolean editPatientAge(int patientAge) {
        //invalid if age is below 0 (negative)
        if (patientAge < 0) {
            //set age to default value of 0 if age is invalid
            setPatientAge(0);
            //error statement if the age is invalid
            System.out.println("Error: Invalid Age Entered");
            return false;
        } else {
            //set patient age to user's input if the value is valid (positive integer)
            setPatientAge(patientAge);
            //print the result of edit method 
            System.out.println("Edited Patient Age: " + getPatientAge());
            return true;
        }
    }

    //editing existing SSN 
    public boolean editPatientSSN(int patient4SSN) {
        //invalid if SSN is below 0 
        if (patient4SSN < 0) {
            //set SSN back to default value of 0 if SSN is invalid 
            setPatient4SSN(0);
            //error statement if the SSN is invalid
            System.out.println("Error: Invalid SSN Entered");
            return false;
        } else {
            //set patient SSN to user's input if it's valid
            setPatient4SSN(patient4SSN);
            //print statement for successful edit
            System.out.println("Edited Patient SSN: " + getPatient4SSN());
            return true;
        }
    }

    //display method
    public void displayPatients() {
        //Patient Chart showing all the values
        System.out.println("\n");
        System.out.println("     Patient Chart      ");
        System.out.println("------------------------");

        //getter to retrieve all the values entered 
        System.out.println("Patient Name: " + getPatientLastName() + ", " + getPatientFirstName());
        System.out.println("Patient Age: " + getPatientAge());
        System.out.println("Last 4 SSN: " + getPatient4SSN());
        System.out.println("Gender: " + getGender());
        System.out.println("Body Temperature: " + getBodyTemp());
        System.out.println("Blood Type: " + getBloodType());
        System.out.println("Symptom: " + getSymptom());
        //if isInsured = true -> print "Insured" ; else -> print "No Insurance"
        //different print statement based on boolean result
        if(isInsured) {
            System.out.println("Insured");
        } else {
            System.out.println("No Insurance");
        }

        System.out.println("------------------------\n");
    }   


        //Override toString
        @Override
        public String toString() {
            //toString method printing all the values
            String s = "\n     Patient Chart      " + "\n";
            s = s +  "------------------------" + "\n";
            s = s +  "Patient Name: " + getPatientLastName() + ", " + getPatientFirstName() +"\n";
            s = s + "Patient Age: " + getPatientAge() + "\n";
            s = s +  "Last 4 SSN: " + getPatient4SSN() + "\n";
            s = s +  "Gender: " + getGender() + "\n";
            s = s +  "Body Temperature: " + getBodyTemp() + "\n";
            s = s +  "Blood Type: " + getBloodType() + "\n";
            s = s +  "Symptom: " + getSymptom() + "\n";
            //if isInsured = true -> print "Insured" ; else -> print "No Insurance"
            //different print statement based on boolean result
            if (isInsured) {
                s = s + "Insured\n";
            } else {
                s = s + "No Insurance\n";
            }
            s = s +  "------------------------" + "\n\n";
            //return s to print all of them
            return s;
        }   
}
