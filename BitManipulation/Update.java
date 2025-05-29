package BitManipulation;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the operation: ");
            int oper = sc.nextInt();
            int n = 5;
            int pos = (oper == 1) ? 1: 2;

            int bitMask = 1<<pos;
            if(oper == 1) {
                // set operation
                int newNumber = bitMask | n;
                System.out.println(newNumber);
            }else{
                int newbitmask = ~(bitMask);
                int newNumber = newbitmask & n;
                System.out.println(newNumber);
            }
        }
    }
}
