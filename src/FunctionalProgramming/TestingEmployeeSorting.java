package FunctionalProgramming;

import java.util.List;

public class TestingEmployeeSorting {
    public static void main(String[] args) {
        
       List<Employee> list = List.of(
        new Employee(45000, "Aaditya"),
        new Employee(40000, "Ayush"),
        new Employee(47000, "Aryan"),
        new Employee(36000, "Akshay"),
        new Employee(50000, "Ajay")
       );

       list.stream()
       .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
       .forEach(System.out::println);
    }
}
//We can also use
//.sorted(Comparator.comparing(emp -> emp.getSalary()))