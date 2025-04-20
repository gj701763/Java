package Thread;

class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread - A" + i);
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread - B" + i);
        }
    }
}

public class Runneble {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread t = new Thread(a);
        Thread t1 = new Thread(b);
        t.start();
        t1.start();
    }
}
