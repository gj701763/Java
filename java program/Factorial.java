import java.util.Scanner;

public class Factorial {
    public static void printfactorial(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is : "+ fact);
        return;

    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your no is : ");
            int n = sc.nextInt();
            printfactorial(n);
        }
    }
    
}
