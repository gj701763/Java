package BitManipulation;

public class Clear {
    public static void main(String[] args) {
        int n = 5; 
        int pos = 2;
        int bitMask = 1<<pos;

        int newbitmask = ~(bitMask);
        int newNumber = newbitmask & n;
        System.out.println(newNumber);
    }
}
