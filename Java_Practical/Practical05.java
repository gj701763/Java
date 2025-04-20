
// 1) Sorting an array of String in ascending order.
import java.util.*;

public class Practical05 {

    static void SortingArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Size of String : ");
            int n = sc.nextInt();
            String arr[] = new String[n];

            System.out.println("Enter the " + n + " Size of array is : ");
            Scanner s1 = new Scanner(System.in);
            System.out.println(s1);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = s1.nextLine();
            }
            System.out.println("Sorting of String is : ");
            Practical05.SortingArray(arr);

        }
    }
}
