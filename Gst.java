import java.util.*;

public class Gst {
    public static void main(String[] args) {
        int arr[][] = {{2,8,3,4,7},
                       {7,2,1,6,3},
                       {5,5,4,1,4},
                       {3,1,4,2,4}};
        
        int r = arr.length;
        int c = arr[0].length;
        int telement = 0;
        int topr = 0, bottomr = r - 1, leftc = 0, rightc = c - 1;
        int n = r * c;

        while (telement < n) {
            // left → right
            for (int i = leftc; i <= rightc && telement < n; i++) {
                System.out.print(arr[topr][i] + " ");
                telement++;
            }
            topr++;

            // top → bottom
            for (int i = topr; i <= bottomr && telement < n; i++) {
                System.out.print(arr[i][rightc] + " ");
                telement++;
            }
            rightc--;

            // right → left
            for (int i = rightc; i >= leftc && telement < n; i--) {
                System.out.print(arr[bottomr][i] + " ");
                telement++;
            }
            bottomr--;

            // bottom → top
            for (int i = bottomr; i >= topr && telement < n; i--) {
                System.out.print(arr[i][leftc] + " ");
                telement++;
            }
            leftc++;
        }
    }
}
