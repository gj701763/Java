import java.util.*;

public class swaptwono {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first No is : ");
            int a = sc.nextInt();
            System.out.print("Enter the second No is : ");
            int b = sc.nextInt();

            a = a - b;
            b = b + a;
            a = b - a;

        }
    }
}
