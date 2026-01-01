

public class PrintNumber {
    public static void num(int n) {
        if (n < 0) return;  // handle negative numbers gracefully
        System.out.println(n);
        if (n == 0) return;
        num(n - 1);
    }

    public static void main(String[] args) {
        num(4);
    }
}