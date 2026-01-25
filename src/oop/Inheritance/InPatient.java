package oop.Inheritance;

public class InPatient extends HospitalRecord {

    private int roomNumber;
    private int daysAdmitted;

    public InPatient(String recordId, String patientName, int roomNumber, int daysAdmitted) {
        super(recordId, patientName);
        this.roomNumber = roomNumber;
        this.daysAdmitted = daysAdmitted;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }
    
    public void displayInPatientDetails(){
        displayRecord();
        System.out.println("Room Number: " + getRoomNumber()+
        ", Days admitted: " + getDaysAdmitted());
    }
}
