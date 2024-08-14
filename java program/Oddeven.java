import java.util.*;
public class Oddeven 
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter your n is : ");
            int n = sc.nextInt();

            // if(n % 2 == 0)
            // {
            //     System.out.println("Number is Even");
            // }
            // else
            // {
            //     System.out.println("Number is odd");
            // }
            // for( int i = 0; i <= n; i+=2){
            //     System.out.println(i);
            // }

            int i = 1;
            while(i <= n){
                if(i % 2 != 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }

    
}
