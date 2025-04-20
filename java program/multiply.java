import java.util.Scanner;

public class multiply {
    public static int addmul(int a, int b) {
        int multi = (a * b);
        System.out.println("Multiply by a and b is : "+ multi);
        return multi;
    }               
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your no a is : ");
            int a = sc.nextInt();
            System.out.print("Enter your no b is : ");
            int b = sc.nextInt();

            addmul(a, b);
        }
    }
    
}
