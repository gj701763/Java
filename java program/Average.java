import java.util.Scanner;

public class Average {
    public static void printAverage(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.print("Three no Average is : " + avg);
        return;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your A is : ");
            int a = sc.nextInt();
            System.out.print("Enter your B is : ");
            int b = sc.nextInt();
            System.out.print("Enter your C is : ");
            int c = sc.nextInt();
            printAverage(a, b, c);

        }
    }
}
