import java.util.Scanner;

public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;

        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }

        return (n == 1) ? true : false;
    }

    public static void main(String[] args) {
       
        int n = 10;
        int count = 0; 
        int i = 1; 

        System.out.print("First " + n + " Ugly Numbers: ");
        while (count < n) {
            if (isUgly(i)) {
                System.out.print(i + " "); 
                count++;
            }
            i++;
        }
    }

}
