package DSA_In_Java.Hashing.Map;
import java.util.*;
public class CountPoints {
    public static int countPoints(String s) 
    {
        Map<Character, Character> map = new HashMap<>();
        char arr[] = s.toCharArray();
        for(int i = 0; i < arr.length-1; i = i + 2)
        {
            map.put(arr[i], arr[i+1]);
        }

        return map.size() == 3 ? 1 : 0;
    }

    public static void main(String[] args) {
        String s = "G4";
        System.out.println(countPoints(s));
    }
}
