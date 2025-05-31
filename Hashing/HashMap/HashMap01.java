package Hashing.HashMap;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("Gajanan", 20);
        map.put("Payal", 21);
        map.put("Siddhant", 22);

        System.out.println(map);

        // Searching
        // System.out.println(map.containsKey("Gajanan"));
        // System.out.println(map.get("Gajanan"));

        // int arr[] = {1,2,3,4,5};
        // for(int val : arr) {
        // System.out.print(val + " ");
        // }

        // for (Map.Entry<String, Integer> e : map.entrySet()) {
        //     System.out.println(e.getKey() + " = " + e.getValue() );
        // }

        // Set<String> keys = map.keySet();
        // for(String key : keys) {
        //     System.out.println(key+ " = " + map.get(key));
        // }

        // Remove

        map.remove("Siddhant");
        System.out.println(map);

    }
}
