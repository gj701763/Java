import java.util.*;
public class negativeno {

    static int findno(int arr[]) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                ans = arr[i];
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
            System.out.println("Negative no is : "+findno(arr));
        }
    }
}