package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
            "Programming",
                "Java",
                "Development",
                "Code",
                "Microservices"
        );

       String result = list.stream()
                           .filter(s -> s.length() > 10)
                           .reduce(" ", (a,b) -> a + " " + b);
            
          System.out.println("Concatenated: " + result);
    }
}