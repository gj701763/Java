import java.util.Scanner;
/*  Take an array of Strings input from the user & find the cumulative (combined)
     length of all those strings. */

public class StringsLength {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of : ");
            int size = sc.nextInt();
            String array[] = new String[size];
            int totLength = 0;

            System.out.print("Enter your array : ");
            for(int i = 0; i < size; i++) {
                array[i] = sc.next();
                totLength += array[i].length();
            }
            System.out.println(totLength);
        }
    }
    
}
