import java.util.*;
public class Practical10 {
    static void DivideByZero() {
        int i = 9;
        int j = 0;
        try{
            i = i / j;
        }catch(Exception e) {
            System.out.println("Exception is : " + e);
        }
    }

    static void NullString() {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(Exception e) {
            System.out.println("Exception is : "+ e);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter choice is \n  1. Divide by zero \n  2. Null by values \n -> : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: DivideByZero();
                break;
                case 2 : NullString();
                break;
                default : System.out.println("Something went wrong !!!");
            }
        }
    }
}
