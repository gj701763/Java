package Recursion;

public class SumOFNnumber {

    public static int sumN(int n) {

        if(n == 0) {
            return 0;
        }

        return n + sumN(n-1); // 1 2 3 4 5
    }
    public static void main(String[] args) {
        int res = sumN(4);
        System.out.println(res);
    }
}
