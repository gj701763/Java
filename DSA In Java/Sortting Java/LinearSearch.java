import java.util.*;
class linear {
    public int linears(int arr[], int size, int element) {
        for(int i = 0; i < size; i++) {
            if(arr[i] == element) {
             return i;
            }
        }
        return -1;
        
    }
    
}
public class LinearSearch {
    public static void main(String args[]) {
        System.out.print("Enter the size of array is : ");
        try(Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter the array is : ");
            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter your key element is : ");
            int element = sc.nextInt();
            linear l = new linear();
            //l.linears(arr, size,element);
            //l.linears(arr, size, element);
            System.out.println(l.linears(arr, size, element));
            
            
        }
    }
    
}
