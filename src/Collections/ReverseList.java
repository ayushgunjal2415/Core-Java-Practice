package Collections;
import java.util.*;

public class ReverseList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}

