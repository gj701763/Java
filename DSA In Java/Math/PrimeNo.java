import java.util.*;
public class PrimeNo {
    public static String isPrime(int n){

        if(n == 1) {
            return "is not a prime number ";
        }

        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                return "no prime ";
            }
        }

        return "is prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the how many time run this code : ");
        int q = sc.nextInt();
       
        while(q-- > 0) {
            System.out.print("Enter the no is : ");
            int n = sc.nextInt();
            String str = isPrime(n);
            System.out.println(str);
        }
        sc.close();;
    }
}
