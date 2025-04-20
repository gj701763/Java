import java.util.Scanner;

public class Floystriangle {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Row is : ");
            int n = sc.nextInt();
            // int num = 1;
            // for(int i=1; i<=n; i++) {
            //     for(int j=1; j<=i; j++) {
            //         System.out.print(num+" ");
            //         num++;
            //     }
            //     System.out.println();
            // }

            for(int i=1; i<=n; i++) {
                for(int j=1; j<=i; j++) {
                    int sum = i + j;
                    if (sum % 2 == 0) {
                        System.out.print("1 ");
                    }
                    else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
}
