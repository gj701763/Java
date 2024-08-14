import java.util.*;

public class Numbergreater 
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter your a is : ");
            int a = sc.nextInt();
            System.out.print("Enter your b is : ");
            int b = sc.nextInt();

            if(a == b)
            {
                System.out.println("Number is Equal");
            }
            else if(a > b)
            {
                System.out.println("A is Greater Than B");
            }
            else
            {
                System.out.println("B is Greater Than A");
            }
        }
    }
    
}
