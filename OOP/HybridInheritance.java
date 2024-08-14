//          Hybrid Inheritance

//                        Class A
//                           |
//                           |
//                        Class B              Class D
//                           |                     |
//                           |                     |
//                        Class C-------------------

import java.util.Scanner;

class A {
    int a;
    public void getdata() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your a no is : ");
            a = sc.nextInt();
        }
    }
}

class B extends A {
    int b;
    private Scanner sc;
    public void getdataB() {
        System.out.print("Enter your b no is : ");
        b = sc.nextInt();
    }
}

class D extends A {
    int d;
    private Scanner sc;
    public void getdataD() {
        System.out.print("Enter your d no is : ");
        d = sc.nextInt();
    }
}

public class HybridInheritance {

} 