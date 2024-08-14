import java.util.Scanner;
interface A {
    void add(int a,int b);
}

interface B {
    void mul(int c, int d);
}

class Display implements A, B {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of a and b is : "+ sum );
        
    }

    public void mul(int c, int d) {
        int multi = c * d;
        System.out.println("Multiply of c and d is : "+multi);
     }
}

public class Interfaces {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your no a is : ");
            int a = sc.nextInt();
            System.out.print("Enter your no b is : " );
            int b = sc.nextInt();           
            Display d = new Display();
            d.add(a,b);
            Display d1 = new Display();
            System.out.print("Enter your no c is : ");
            int c = sc.nextInt();
            System.out.print("Enter your no d is : " );
            int d2 = sc.nextInt();       
            d1.mul(c,d2);
        }
    }
}
