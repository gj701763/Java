import java.util.*;
class binary {
    public int binarys(int arr[], int size, int element) {
        int left , mid , right;
        left = 0; 
        right = size - 1 ;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr[mid] == element) {
                return mid;
            }
            if(arr[mid] < element) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
public class BinarySearch {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int size = sc.nextInt();
            int arr[] = new int[size];

            System.out.print("Enter the array is : ");
            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the key of element is : ");
            int element = sc.nextInt();

            binary b = new binary();
           
            System.out.println(b.binarys(arr, size, element));
        }
    }
    
}
