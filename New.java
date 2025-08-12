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
       int arr[] = {1,2,2,3,3};
       System.out.println(duplicate(arr));

    }
}
