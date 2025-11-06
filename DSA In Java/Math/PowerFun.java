public class PowerFun {

    public static double myPow(double x, int n) {
        // Base cases
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / myPow(x, -n);

        // Recursive step
        double half = myPow(x, n / 2);

        if (n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n)); // Output: 1024.0
    }
}
