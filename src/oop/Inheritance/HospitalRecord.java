package oop.Inheritance;

 class HospitalRecord {
    private String recordId;
    private String patientName;
    
    public HospitalRecord(String recordId, String patientName) {
        this.recordId = recordId;
        this.patientName = patientName;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getPatientName() {
        return patientName;
    }

    void displayRecord(){
        System.out.println("Record ID: " + getRecordId() +
    ", Patient name: " + getPatientName());
    }
}
