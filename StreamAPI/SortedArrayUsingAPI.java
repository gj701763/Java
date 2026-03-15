package StreamAPI;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class SortedArrayUsingAPI {

    public static void SortedArr(int arr[]) {
        Arrays
                .stream(arr)
                .filter((n) -> n % 2 == 0)
                .map((n) -> n * 5)
                .boxed()
                .sorted((a, b) -> b - a)
                .forEach((n) -> System.out.print(n + " "));
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array is : ");
            int n = sc.nextInt();
            System.out.print("Enter the array elements : ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            SortedArr(arr);
        }
    }
}
