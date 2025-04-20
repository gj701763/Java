import java.util.Scanner;

public class functionaddno {
    public static int addSum(int a, int b) {
        int sum = (a + b);
        System.out.print("Sum of a and b is : ");
        System.out.println(sum);
        return sum;
    }               
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your no a is : ");
            int a = sc.nextInt();
            System.out.print("Enter your no b is : ");
            int b = sc.nextInt();

            addSum(a, b);
        }
    }
    
}
