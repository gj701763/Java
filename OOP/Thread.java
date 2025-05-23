package OOP;

class Multi extends Thread {  
    public Multi(Practical09 practical09) {
        super(practical09);
        //TODO Auto-generated constructor stub
    }
    public void run(){
        System.out.println("thread is running...");
    }
    public void start(){
        System.out.println("Start the threads !!!");
    }
    
}
class Thread {
    public Thread(Practical09 practical09) {
    }

    public static void main(String args[]){
        Multi t1=new Multi(null);  
        t1.start();  
        t1.run();
    }

    public void start() {
    }

    public static void sleep(int i) {
    }  
}
