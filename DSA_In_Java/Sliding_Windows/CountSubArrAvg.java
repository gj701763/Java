public class CountSubArrAvg {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0, count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if((sum/k) >= threshold)
        {
            count++;
        }
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            int avg = sum / k;
            if (avg >= threshold) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
}
