package OOP;


class A
{
    A(int x)
    {
        System.out.println("value of x is " + x);
    }
}

class B extends A
{
    B()
    {
        super(5);
        System.out.println("I am a Child Constructor!!!");
    }
}

public class Supers 
{
    public static void main(String[] args) {
        B b = new B();
    }
}
