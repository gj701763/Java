import java.util.*;

public class ProductofArray {

    public static int[] multiArr(int arr[]) {  //  ------Brute-force-----
        int n = arr.length;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue; // skip the same index
                product *= arr[j];
            }
            ans[i] = product;
        }

        return ans;
    }

    public static int[] multiArrO(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int pre = 1, pos = 1;
        Arrays.fill(ans, 1);
        for(int i = 0; i < n; i++) {
            ans[i] = pre;
            pre *= arr[i];
        }
        for(int i = n-1; i >= 0; i--) {
            ans[i] = ans[i] * pos;
            pos *= arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int res[] = multiArrO(arr);
        System.out.println(Arrays.toString(res));
    }
}
