package Strings;

public class StudentToStringDemo {
    String name;
    int age;
    int id;
    String collegeName;

    StudentToStringDemo(String name, int age, int id, String collegeName){
        this.name = name;
        this.age = age;
        this.id = id;
        this.collegeName = collegeName;
    }


    @Override
    public String toString() {
        return "Student Details: [ Name is " + name + ", age is" + age 
        + ", id is" + id + ", collegeName is" + collegeName
                + " ] ";
    }


    public static void main(String[] args) {
        StudentToStringDemo s = new StudentToStringDemo("Ayush", 21, 98, "JSPM University");
        System.out.println(s);
    }
}