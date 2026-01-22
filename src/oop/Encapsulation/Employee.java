package oop.Encapsulation;

 class Employee {
    private String empName;
    private int empAge;
    private double empSalary;

     Employee(String empName, int empAge, double empSalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    String displayEmpDetails(){
        return "Employee Details: Name: " + empName + ", Age: " 
        + empAge + ", Salary: " + empSalary;
    }

     public String getEmpName() {
         return empName;
     }

     public void setEmpName(String empName) {
         this.empName = empName;
     }

     public int getEmpAge() {
         return empAge;
     }

     public void setEmpAge(int empAge) {
         this.empAge = empAge;
     }

     public double getEmpSalary() {
         return empSalary;
     }

     public void setEmpSalary(double empSalary) {
         this.empSalary = empSalary;
     }

    
}
