package Collections;
import java.util.*;

public class UniqueCharactersCount {

    public static void main(String[] args) {

        String str = "programming";

        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        System.out.println("Unique characters: " + set);
        System.out.println("Count of unique characters: " + set.size());
    }
}