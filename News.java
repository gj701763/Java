import java.util.Scanner;

public class News {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the element : ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
    } 
}
