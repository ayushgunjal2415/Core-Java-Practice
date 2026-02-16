package Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Compare grades properly
                return Character.compare(s1.getGrade(), s2.getGrade());
            }
        });

        //offer() inserts element
        queue.offer(new Student("Ayush", 'B'));
        queue.offer(new Student("Aryan", 'C'));
        queue.offer(new Student("Ram", 'A'));
        queue.offer(new Student("Rushi", 'D'));
        queue.offer(new Student("Sahil", 'A'));

        System.out.println("Polling students in priority order:");

        //poll() Remove + return highest priority
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static class Student {
        private String name;
        private char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }
}

