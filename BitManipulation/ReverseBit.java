package BitManipulation;

public class ReverseBit {
    public static int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {  
            rev <<= 1;                 
            rev |= (n & 1);            
            n >>= 1;            
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(reverseBits(n)); // Output: 2684354560
    }
}
