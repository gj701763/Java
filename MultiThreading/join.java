package MultiThreading;

class A extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread A : " + i);
                sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Error is found" + e);
        }
    }
}

class B extends Thread {
    public void run()
    {
        try{
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("Thered B : "+ i);
                sleep(1000);
            }
        }catch(InterruptedException e)
        {
            System.out.println("Error is found"+ e);
        }
    }
}

public class join {
    public static void main(String[] args) {
        A a = new A();
        a.start();
       try {
           a.join();
       } catch (Exception e) {
        System.out.println("Error found "+ e);
       }
        B b = new B();
        b.start();
    }
}
