package BitManipulation;

public class Get {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n) == n){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}
