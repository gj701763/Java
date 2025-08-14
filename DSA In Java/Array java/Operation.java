import java.util.*;
public class Operation {

    public static void print(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void operation(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                arr[i] = arr[i] + 10;
            }else{
                arr[i] = arr[i] * 2;
            }
        }
        print(arr);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the element of array is : ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            operation(arr);
        }
    }
}
