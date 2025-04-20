/* Given an array, find the most frequent element in it. if there are multiple elements that appear a maximum number of times, print any one of them*/

import java.util.*;

public class HashMapQue01 {

    static void print(int arr[]) {
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 

    static void freHashMap(int arr[]) {
        Map<Integer,Integer> fre = new HashMap<>();
        for(int el : arr) {
            if(!fre.containsKey(el)) {
                fre.put(el, 1);
            }else{
                fre.put(el, fre.get(el) + 1);
            }
        }

        System.out.print("print the all entrySet is : ");
        System.out.println(fre.entrySet());

        int maxFre = 0;
        int ansKey = -1;

        for(var e : fre.entrySet()) {
            if(e.getValue() > maxFre) {
                maxFre = e.getValue();
                ansKey = e.getKey();
            }
        }

        System.out.printf("Print the Maximun of element is : %d", ansKey);

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();

            int arr[] = new int[n];        // [1,2,5,1,4,4,6,4,4,4]
            System.out.printf("Enter the %d size of array is : ", n);
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // System.out.print("The answer array is : ");
            // print(arr);
            freHashMap(arr);
        }
    }
}
