import java.util.Scanner;

public class SquareRoot {

    public static int squareRoot(int n) {
        int root  = 0;
        for(int i = 1; i < n; i++) {
            if(i * i > n) break;
            root = i;
        }

        return root;
    }

    public static int binaryRoot(int n) {
        int left = 1; 
        int right = n;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right + left) / 2;
            if(mid * mid == n) return mid;
            else if((long)mid * mid > n) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(squareRoot(n));
        System.out.println(binaryRoot(n));
        sc.close();

    }
}
