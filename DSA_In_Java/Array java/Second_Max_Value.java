import java.util.*;
public class Second_Max_Value {

    static int max_value(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > mx)  {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int Second_max_value(int arr[]){
        int mx = max_value(arr);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int second_Max = max_value(arr);
        return second_Max;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : "); 
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the "+n+" size fo array is : "); 
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Second Last value is : "+ Second_max_value(arr));
        }
    }
}
