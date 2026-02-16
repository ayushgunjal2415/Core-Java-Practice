package Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapitalMap {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington DC");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");
        map.put("Australia", "Canberra");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country name: ");
        String country = sc.nextLine();


        if(map.containsKey(country)){
            System.out.println("Capital of " + country + " is " + map.get(country));
        } else{
            System.out.println("Country not found in map.");
        }

        sc.close();
   }
} 