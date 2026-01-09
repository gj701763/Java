/*  Give an array 'a' consisting of integers. 
    Return the first value that is repeating in this array. 
    if no value is being repeated, return -1.
*/
import java.util.*;
public class Repeat_Element {

    static int Repeatin_NO(int arr[]) {
        int ans = -1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : "); 
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the "+n+" size of array is : "); 
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Repeating Element is : "+Repeatin_NO(arr));
        }
    }
}