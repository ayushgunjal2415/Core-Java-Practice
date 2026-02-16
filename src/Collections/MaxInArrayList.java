import java.util.ArrayList;
import java.util.List;

public class MaxInArrayList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(42);
        numbers.add(8);
        numbers.add(67);
        numbers.add(23);

        int max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        System.out.println("ArrayList: " + numbers);
        System.out.println("Maximum number: " + max);
    }
}