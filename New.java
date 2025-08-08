import java.util.*;
import java.util.Arrays;

public class New {

    public static int duplicate(int arr[]) {
        
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[i-1]) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr[] = {1,2,2,3,3};
       System.out.println(duplicate(arr));

    }
}
