package Hashing.Hashset;

import java.util.*;

public class UnionAndIntersectionArr
{

    public static List<Integer> union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        l.addAll(set);

        return l;
    }

    public static List<Integer> intersection(int arr1[], int arr2[]) {
        //int count = 0;
        HashSet<Integer> set = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])){
                // count++;
                set.remove(arr2[i]);
            }
        }
        
        return l;

    }

    public static void main(String[] args) {
        int arr1[] = { 7, 6, 3 };
        int arr2[] = { 6, 2, 5, 6, 9, 3 };
        //System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }
}
