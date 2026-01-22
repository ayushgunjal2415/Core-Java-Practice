package oop.Encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student(29, "Ayush"  , 92);
        System.out.println(s.displayStudentDetails());
        s.setName("Aaditya");
        s.setRollNo(25);
        s.setMarks(88);
        System.out.println(s.displayStudentDetails());

        s.setMarks(101); //Invalid case 
        System.out.println("After invalid marks update: ");
        System.out.println(s.displayStudentDetails());
    }
    
}
