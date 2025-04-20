import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your no is : ");
            int n = sc.nextInt();
            int b;
            for(int i = 1; i <= 10; i++){
                 b = n * i;
                System.out.println(b);
            }
        }
    }
}
