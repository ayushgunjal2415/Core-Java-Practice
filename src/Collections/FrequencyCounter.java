package Collections;
import java.util.*;

public class FrequencyCounter {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.add("Java");

        System.out.println(list);

        int frequency = Collections.frequency(list, "Java");
        int frequency1 = Collections.frequency(list, "C++");

        System.out.println("Frequency of Java: " + frequency);
        System.out.println("Frequency of C++: " + frequency1);
    }
}
