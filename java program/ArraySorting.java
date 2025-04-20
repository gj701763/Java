import java.util.Scanner;

public class ArraySorting {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Your Size of Array : ");
            int size = sc.nextInt();
            int number[] = new int[size];

            // Input
            for(int i = 0; i < size; i++) {
                number[i] = sc.nextInt();
            }

            boolean isAscending = true;

            for(int i = 0; i < number.length - 1; i++) {
                if(number[i] > number[i + 1]) {  // this condition is descending order
                    isAscending = false;
                }
            }

            if(isAscending) {
                System.out.println("Array is Sorted in Ascending Order !!!");
            }else {
                System.out.println("Array is sorted in Descending Order !!!");
            }
        }
    }
}