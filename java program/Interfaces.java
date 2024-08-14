interface A {
    void math1();
    void math2();
}

interface B extends A {
    void math3();
}

class Myclass implements B {
    public void math1() {
        System.out.println("Implement math1().");
    }

    public void math2() {
        System.out.println("Implement math2().");
    }

    public void math3() {
        System.out.println("Implement math3().");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Myclass m = new Myclass();
        m.math1();
        m.math2();
        m.math3();
    }
}
