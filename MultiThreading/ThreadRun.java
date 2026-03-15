package MultiThreading;

class FirstThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

public class ThreadRun {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread(); // create object of First
        t1.start(); // start thread
    }
}