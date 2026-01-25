package oop.ObjectClass;

public class Employee {

 private int empId;
 private String email;
 private double salary;
 
 public Employee(int empId, String email, double salary) {
    this.empId = empId;
    this.email = email;
    this.salary = salary;
 }

 public int getEmpId() {
    return empId;
 }

 public String getEmail() {
    return email;
 }

 public double getSalary() {
    return salary;
 }

 @Override
 public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + empId;
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    return result;
 }

 @Override
 public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Employee other = (Employee) obj;
    if (empId != other.empId)
        return false;
    if (email == null) {
        if (other.email != null)
            return false;
    } else if (!email.equals(other.email))
        return false;
    return true;
 }
 
 public static void main(String[] args) {
    Employee e1 = new Employee(424, "employee1@gmail.com", 55000.0);
    Employee e2 = new Employee(424, "employee1@gmail.com", 45000.0);

    System.out.println(e1.equals(e2));

    System.out.println(e1.hashCode());
    System.out.println(e2.hashCode());
 }


}
