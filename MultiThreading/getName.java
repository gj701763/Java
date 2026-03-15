package MultiThreading;
//Q5. Create 2 threads and print their names using getName().

public class getName {
    public static void main(String[] args) {
        Thread t1 = new Thread("Alpha-Thread") {
            public void run() {
                System.out.println("Running: " + getName());
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("Running: " + getName());
            }
        };
        t2.setName("Beta-Thread");

        t1.start();
        t2.start();
    }
}
