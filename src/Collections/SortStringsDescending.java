package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringsDescending {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Cherry");
        list.add("Guava");
        list.add("Banana");
        list.add("Orange");

        // Custom Comparator for descending order
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // reverse order
            }
        });

         System.out.println("Sorted List (Descending): " + list);
    }
}
