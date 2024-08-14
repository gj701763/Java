import java.util.Scanner;

/* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
    2 : - (Subtraction) a - b
    3 : * (Multiplication) a * b
    4 : / (Division) a / b
    5 : % (Modulo or remainder) a % b
           Calculate the result according to the operation given and display it to the user. 
 */


public class Calcy {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your First Number is : ");
            int a = sc.nextInt();
            System.out.print("Enter your operatpor is(+,-,*,/,%) : ");
            char op = sc.next().charAt(0);
            System.out.print("Enter your second Number is : ");
            int b = sc.nextInt();
            
            switch(op){
                case '+':System.out.print("Sum of A + B = ");
                System.out.println(a + b);
                break;
                case '-':System.out.print("Difference Between A - B = ");
                System.out.println(a - b);
                break;
                case '*':System.out.print("Multiply A * B = ");
                System.out.println(a * b);
                break;
                case '/':System.out.print("Divide A / B = ");
                System.out.println(a / b);
                break;
                case '%':System.out.print("Module A % B = ");
                System.out.println(a % b);
                break;
                default : System.out.println("Invalid Operator is Enter !!!");
                break;

            }
        }
    }
    
}
