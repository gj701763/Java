import java.util.*;

public class StringPresent {

    public static int presentString(String soham, String ad) {
        int count = 0;
        Set<String> set = new HashSet<>();
       
        for (int i = 0; i < soham.length(); i++) {
            set.add(String.valueOf(soham.charAt(i)));
        }

        for(int i = 0; i < ad.length(); i++) {
            if(set.contains(String.valueOf(ad.charAt(i)))){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String soham = "z";
        String ad = "ZZ";
        int se = presentString(soham, ad);
        System.out.println(se);
    }
}
