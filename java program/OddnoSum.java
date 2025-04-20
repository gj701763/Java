import java.util.Scanner;

/*   Write a function to print the sum of all odd numbers from 1 to n  */

public class OddnoSum {


    public static void printOddNo(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.print("Sum of Odd Number is : " + sum);

        return;
    }

    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your n no is : ");
            int n = sc.nextInt();
            printOddNo(n);
        }
    }
}
