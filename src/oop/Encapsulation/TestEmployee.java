package oop.Encapsulation;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Ayush", 21, 45000);
        System.out.println(emp.displayEmpDetails());
        emp.setEmpName("Mahi");
        emp.setEmpAge(45);
        emp.setEmpSalary(80000);
        System.out.println(emp.displayEmpDetails());
    }
}
