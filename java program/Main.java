import java.util.*;

/*   Make a program that takes the radius of a circle as input,
 calculates its radius and area and prints it as output to the user.
  */
public class Main
{
	public static void main(String[] args)
	{
	    try (Scanner sc = new Scanner(System.in)) 
	    {
			System.out.print("Enter Circle radius is : ");
			float r = sc.nextFloat();  // r = radius
			//  int b = sc.nextInt();
			 float area =(3.14F * r * r);
			 System.out.print("Circle Area is : ");
			 System.out.println(area);
		}
	}
}
