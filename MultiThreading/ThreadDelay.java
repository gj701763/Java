package MultiThreading;

class First extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.printf("First  = %d\n", i);
                Thread.sleep(1000); // 10 second
            }
        } catch (InterruptedException ex) {
            System.out.println("Error is" + ex);
        }
    }
}
public class ThreadDelay {
    public static void main(String[] args) {
        First f = new First();
        f.start();
    }
}
