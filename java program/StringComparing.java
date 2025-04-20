import java.util.Scanner;

public class StringComparing {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name1 : ");
            String name1 = sc.nextLine();
            System.out.print("Enter your name2 : ");
            String name2 = sc.nextLine();

            if(name1.equals(name2)) {
                System.out.println("String is equal !!!");
            }
            else {
                System.out.println("String is not equal !!1");
            }
        }
    }
}
