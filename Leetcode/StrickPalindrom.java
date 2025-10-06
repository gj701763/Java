package Leetcode;
import java.util.*;
public class StrickPalindrom {

    private static boolean ispalindrom(int n)
    {
        for(int i = 2; i <= n-2; i++) {
            if(!isbase(n, i))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean isbase(int n, int base)
    {
        StringBuilder sb = new StringBuilder();
        while(n > 0)
        {
            sb.append(n % base);
            n /= base;
        }

        String str = sb.toString();
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter number from user : ");
            int n = sc.nextInt();
            System.out.println(ispalindrom(n));
        }
    }
}
