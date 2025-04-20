/* Practical which illustrates the implementation of inheritance by method overriding, 
Super Constructor and Super Keyword, Abstract class(use any application) */

import java.util.Scanner;

abstract  class parent {      // Abstract class
    abstract public void gretting();
}

class Child extends parent {

    @Override
    public void gretting() {
        System.out.println("Say Good Morning !!! ");
    }
    
}

// Method Overriding
class oop {
    public void show() {
        System.out.println("Show the oop class !!!");
    }
}

class object extends oop {
    public void show() {
        System.out.println("Show the object class !!!");
    }
}
class Classes extends object {
    public void show() {
        System.out.println("Show the classes !!!");
    }
}

// Method Super Keywords
class Teacher {
    public void study() {
        System.out.println("Called the teacher funtion !!!"); 
    }
}


class Student extends Teacher {
    public void study() {
        System.out.println("Called the student funtion !!!");
    }

    void display() {
        //study();
        super.study();
    }
}

// Super Variables
class marks {
    public int math = 99;
}

class resutl extends marks {
    public int math = 98;
    void display() {
        System.out.println("Marks of math is : "+super.math);
    }
}

// Super Constructer
class Father {
    Father() {
        System.out.println("Father Constructor is called !!!");
    }
}

class kids extends Father {
    kids() {
        super();
        System.out.println("Kids Constructor is called !!!");
    }
}
public class Practical04 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1 Run Abstract class");
            System.out.println("Enter 2 Run Method Overloading");
            System.out.println("Enter 3 Run Method Super Keywords");
            System.out.println("Enter 4 Run Super Variable Keywords");
            System.out.println("Enter 5 Run Super Constructors");
            System.out.print("Enter your key is : ");
            int n = sc.nextInt();
            switch(n) {
                case 1 :  Child C = new Child();     // Abstract class
                C.gretting();
                break;
                case 2 : oop c = new Classes();      // Method Overloading
                c.show();
                break;
                case 3 : Student s = new Student();  // Methos Super Keywords
                s.display();
                break;
                case 4 : resutl r = new resutl();    // Super Keywords Variables
                r.display();
                break;
                case 5 : new Father();                 // Super Constructor
                break;
                default : System.out.println("Invalid Number is Enter !!!");
            }
        }
    }
}
