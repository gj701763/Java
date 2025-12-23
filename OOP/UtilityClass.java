package OOP;

class A{
    private A()
    {
        System.out.println("I am a Utility Constructor");
    }
    static void show()
    {
        System.out.println("I am a static method in utility");
    }
}

public class UtilityClass {
    public static void main(String[] args) {
        A.show();
    }
}
