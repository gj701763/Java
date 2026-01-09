//In Java.CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(6);
        System.out.println(list);
        System.out.println("max value in the list is : " + Collections.max(list));
        System.out.println("Min value in the list is : " + Collections.min(list));
        // System.out.println("Random in the ths list is : "+
        // Collections.shuffle(list));
        System.out.println("Frequency of the elements in the list is : " + Collections.frequency(list, 6));
        Collections.swap(list, 2, 3);
        System.out.println(list);
        List l = list.subList(2, 3);
        //System.out.println(l);
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {

            // System.out.println(i.next());
        }

    }
}
