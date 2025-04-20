package Thread;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread - A " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread - B " + i);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread - C " + i);
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        Thread a = new Thread(new A());
        Thread b = new Thread(new B());
        Thread c = new Thread(new C());
        // a.setPriority(4);
        // b.setPriority(9);
        a.start();
        b.start();
        c.start();
    }
}
