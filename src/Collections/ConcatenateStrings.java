package Collections;
public class ConcatenateStrings {

    // Method with varargs
    public static String concatenate(String... strings) {
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String output = concatenate("Hello ", "Java ", "World!");
        System.out.println("Concatenated String: " + output);
    }
}
