package BitManipulation;

public class Count1 {
    public static int hammingWeight(int n) {
       int count = 0;
        while (n > 0) {
            if(n % 2 == 1){
                count++;
            }
            n /= 2;     
               
        }
        
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }
}
