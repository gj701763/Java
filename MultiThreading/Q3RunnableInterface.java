package MultiThreading;

class First implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello Multithreading");
            }
        } catch (Exception e) {
            System.out.println("Error find : " + e);
        }
    }
}
public class Q3RunnableInterface {
    public static void main(String[] args) {
        First f = new First();
        Thread t = new Thread(f);
        t.start();
    }
}
