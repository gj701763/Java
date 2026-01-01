
public class SortedArr {

    public static boolean sort(int arr[], int n) {
        if(n == 0 || n == 1) {
            return true;
        }
        return (arr[n-1] >= arr[n-2]) && sort(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 15, 16, 47 };
        int n = arr.length;
        System.out.println(sort(arr, n));

    }
}
