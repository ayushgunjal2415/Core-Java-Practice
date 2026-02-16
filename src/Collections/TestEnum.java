package Collections;
public class TestEnum{

    public static void main(String[] args) {
        System.out.println("Printing all days of the week..");

        for (Day day : Day.values()) {
            System.out.println(day+ ": " + day.getType());
        }
    }
}