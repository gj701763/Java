//  Write a Java Program to find Largest among three Numbers

import java.util.Scanner;
public class LangestofThree {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your first No is : ");
            int a = sc.nextInt();
            System.out.print("Enter your second No is : ");
            int b = sc.nextInt();
            System.out.print("Enter your third No is : ");
            int c = sc.nextInt();

            if(a >= b && a >= c) {
                System.out.println("A is langest than b and c : "+ a);
            }else if(b >= a && b >= c) {
                System.out.println("B is langest than a and c : "+ b);
            }else if(c >= a && c >= b) {
                System.out.println("C is langest than a and b : "+ c);
            }else {
                System.out.println("Invalid Numbers !!!");
            }
        }
    }
}