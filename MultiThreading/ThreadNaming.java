package MultiThreading;

public class ThreadNaming {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable() {
            
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });

        Thread t2 = new Thread(new Runnable() {
        
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });

        // Setting names using setName()
        t1.setName("StudentThread");
        t2.setName("TeacherThread");

        t1.start();
        t2.start();
    }
}