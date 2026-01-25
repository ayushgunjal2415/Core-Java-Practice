package oop.Inheritance;

public class OutPatient extends HospitalRecord {
    private String doctorName;
    private String visitDate;
    
    public OutPatient(String recordId, String patientName, String doctorName, String visitDate) {
        super(recordId, patientName);
        this.doctorName = doctorName;
        this.visitDate = visitDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void displayOutPatientDetails(){
        displayRecord();
        System.out.println("Doctor name: " + getDoctorName() + 
        ", Visit date: " + getVisitDate());
    }
}
