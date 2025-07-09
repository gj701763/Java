package Hashing.Hashset;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset01 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        //Searching

        if(set.contains(4)) {
            System.out.println("one is present in hashset");
        }else{
            System.out.println("no");
        }
        System.out.println(set.getClass());

        // count

        System.out.println("Size of set is : " + set.size());
        //print set1
        System.out.println(set);

        // remove 
        //set.remove(1);
        if(!set.contains(1)) System.out.println("we delete 1 form set");

        /// Iterator
        
        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    
    }
}
