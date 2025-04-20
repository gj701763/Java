import java.util.Scanner;

public class Nutualni {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your Nutual no is : ");
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum = sum + i;
            }
            System.out.print("Sum Of Nutual No is : ");
            System.out.println(sum);
        }

    }
    
}
