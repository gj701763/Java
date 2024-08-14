import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Size is : ");
            int size = sc.nextInt();
            int number[] = new int[size];

            // Input
            System.out.print("Enter your Arrays : ");
            for(int i = 0; i < size; i++) {
                number[i] = sc.nextInt();
            }
            //Output
            System.out.print("Enter your Key is : ");
            int x = sc.nextInt();
            for(int i = 0; i <number.length; i++) {
                if( number[i] == x) {
                    System.out.print("Number index is : " + i);
                }
            }
            
        }
    }
    
}
