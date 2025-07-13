//package DSA In Java.Math;

/*
 * Divisible and Non-divisible Sums Difference
 * Input: n = 10, m = 3
   Output: 19
 */

public class DivisibleSumDiff {

    public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for(int i = 1; i <= n; i++) {
            if(i % m == 0) {
                num2 += i;
            }else {
                num1 += i;
            }
        }
        System.out.println(num1);
        System.out.println(num2);

        return num1-num2;
    }

    public static int remainder(int n) { // count Leap Years.
        int rem = 0;
        for(int i = 1; i < n; i++) {
            if(i % 4 == 0) {
                rem++;
            }
        }
        return rem;
    }

    public static void main(String[] args) {
        int n = 100;
        int m = 3;
       //int ans = differenceOfSums(n,m);
       int ans = remainder(n);
       //System.out.println(ans);
       System.out.println(17*7);
    }
    
}
