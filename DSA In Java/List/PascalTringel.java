import java.util.ArrayList;
import java.util.*;

public class PascalTringel {

     public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < list.get(i).size(); j++) {
                List<Integer> l = new ArrayList<>();
                l.add(1);
                list.add(l);
            }
        }
     }
}