package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        
        List<Integer> list = List.of(1,2,4,5,5,1,6,2,9);

        List<Integer> uniqueList = list.stream()
        .distinct()
        .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(uniqueList);
    }
}