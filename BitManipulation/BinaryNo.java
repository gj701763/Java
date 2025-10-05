package BitManipulation;

import java.util.*;

public class BinaryNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        // Handle case for 0
        if (n == 0) {
            System.out.println("0");
            sc.close();
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.append(n % 2); // store remainder (0 or 1)
            n /= 2;          // divide by 2
        }
        
        System.out.println(sb.reverse().toString());
        sc.close();
    }
}
