package oop.Inheritance;

public class TestHospital {
    public static void main(String[] args) {
        InPatient ip = new InPatient("B-431","Akshay", 205, 8);
        System.out.println("----- InPatient Details -----");
        ip.displayInPatientDetails();

        System.out.println();

        OutPatient op = new OutPatient("B-122", 
        "Ramesh", "Dr.Sharma", "25-Jan-2026");
        System.out.println("----- OutPatient Details -----");
        op.displayOutPatientDetails();
    }
}
