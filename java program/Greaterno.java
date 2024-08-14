//Write a function which takes in 2 numbers and returns the greater of those two

import java.util.Scanner;

public class Greaterno {
    public static void printGreaterNo(int a, int b) {
        if( a > b) {
            System.out.print("A is Greater !!!");
        }else if(a < b) {
            System.out.print("B is Greater !!!");
        }else {
            System.out.print("Two Number are Equal !!!");
        }
        return;
    }

    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the no of a is : ");
            int a = sc.nextInt();
            System.out.print("Enter the no of b is : ");
            int b = sc.nextInt();
            printGreaterNo(a, b);
        }
    }
}
