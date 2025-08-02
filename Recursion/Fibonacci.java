package Recursion;

public class Fibonacci {

    public static int fib(int n) { //0 1 1 2 3 5 8
        if(n == 0 || n == 1) {
            return n; 
        }

        return fib(n-1) + fib(n-2);

    }
    public static void main(String[] args) {
        int ans = fib(6);
        System.out.println(ans);
    }
}
