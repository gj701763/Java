public class SumOfArray {

    private static int sumArr(int[] arr, int n) {
        if (n == 0) return 0;
        return sumArr(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 3, 5 };
        int n = arr.length;
        System.out.println(sumArr(arr, n)); 
    }
}
