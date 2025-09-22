import java.util.HashMap;
import java.util.Map;

public class StorFre {
    public static void main(String a[]) {
        String s = "successes";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c == ' ') continue; // skip spaces
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
         int mxv = 0;
         int mx = 0;
        for (Map.Entry<Character, Integer> e : freqMap.entrySet()) {

            if(e.getKey() == 'a' || e.getKey() == 'e' || e.getKey() == 'i' || e.getKey() == 'o' || e.getKey() == 'u') {
                if(e.getValue() > mxv) {
                    mxv = e.getValue();
                }
            }else{
                if(e.getValue() > mx){
                    mx = e.getValue();
                }
            }
        }
        
        System.out.println(mx+mxv);

    }
}
