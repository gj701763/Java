import java.util.*;
import java.util.Arrays;

public class New {

    public static int duplicate(int arr[]) {
        
        int max = arr[0];
        int curr = arr[0];
        for(int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr+arr[i]);
            max = Math.max(curr, max);
        }

        return max;
    }
    public static void main(String[] args) {
       Integer arr[] = {1,2,2,3,3};
       Arrays.sort(arr, (a, b) -> b - a);
       for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
       System.out.println();

    }
}
