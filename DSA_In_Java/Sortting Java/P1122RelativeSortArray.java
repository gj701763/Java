import java.util.HashMap;
import java.util.Map;

public class P1122RelativeSortArray {
    
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int count[] = new int[1001];
        int result[] = new int[arr1.length];
        int idx = 0;
        for(int n : arr1)
        {
            count[n]++;
        }
        for(int n : arr2)
        {
            while(count[n] > 0)
            {
                result[idx++] = n;
                count[n]--;
            }
        }

        for(int i = 0; i < count.length; i++)
        {
            while (count[i] > 0) {
                result[idx++] = i;
                count[i]--;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int arr2[] = {2,1,4,3,9,6};
        int ans[] = relativeSortArray(arr1, arr2);
        for(int n : ans)System.out.print(n+" ");
    }
}
