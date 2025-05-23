/* Create a HashMap using Java HashMap class to store the following pairs(person, Age) and dishplay them.*/
import java.util.*;

public class Hashmap01 {
    static void hashmapMethod() {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Gajanan" , 18);
        mp.put("Bharat" , 19);
        mp.put("Roshan" , 20);
        mp.put("Manmit" , 21);
        mp.put("Ritesh" , 22);

        System.out.print(mp.get("Gajanan"));
        mp.remove("Gajnana"); // its remove function   
        System.out.println(mp.containsKey("Gajanan")); // true or false
      //  mp.putIfAbsent(null, null); // if exit them add new key 
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        for (var e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

    }

    public static void main(String[] args) {
        hashmapMethod();
    }
}
