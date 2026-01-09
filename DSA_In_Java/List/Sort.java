//package DSA In Java.List;

import java.util.*;

class myClass implements Comparator<Integer>{
    public int compare(Integer s1, Integer s2) {
        return s1-s2;
        
    }
}

class myClasss implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }
}

public class Sort {

    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(1);
        list.add(5);

        List<String> list1 = Arrays.asList("Gaju", "Nikita", "Soham","Arushii");
        //list1.sort(new myClasss());
        list1.sort((a, b) -> a.length() - b.length()); 
        System.out.println(list1);

       // list.sort(new myClass());
        list.sort((a, b) -> a - b);
        System.out.println(list);
    }
}
