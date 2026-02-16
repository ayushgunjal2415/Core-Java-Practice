package Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExample{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ayush", 21);
        map.put("Aryan", 25);
        map.put("Aaditya", 36);
        System.out.println(map.size());
        System.out.println(map.containsKey("Aaditya"));
        System.out.println(map.remove("Aryan"));
        System.out.println(map.get("Ayush"));
        System.out.println(map.size());


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Ayush", 21);
        map2.put("Aaditya", 36);

        System.out.println(map.equals(map2));
        
        System.out.println(map.hashCode());
        System.out.println(map2.hashCode());

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}