package Hashing.Questions;

import java.util.HashMap;

public class Itineraryarray {

    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> reMap = new HashMap<>();

        for(String key : tick.keySet()) {
            reMap.put(tick.get(key), key);
        }
        
        for(String key : tick.keySet()) {
            if(!reMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while (tickets.containsKey(start)){
            System.out.print(start+" -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
            
        
    }
}
