package ExceptionHandling;

public class Try_Catch {
    public static void main(String[] args) {
        try {
            int a = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Rest of code ...");
    }
}
