package FunctionalProgramming;

public class Employee {
    private final int salary;
    private final String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [Salary: " + salary + ", Name: " + name + "]";
    }
}