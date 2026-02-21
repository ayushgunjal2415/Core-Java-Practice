package FunctionalProgramming;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        
        List<String> myList = List.of("Apple", "Banana", "Grapes", "Guava","Mango");

        myList.stream()
              .forEach(fruits -> System.out.println(fruits));

    }
}