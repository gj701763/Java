public class KthMissingEle {

    public static int kthmissing(int arr[], int k) {
        int left = 0, right = arr.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int correctIdx = mid + 1;
            int missing = arr[mid] - correctIdx;
            if(missing >= k) right = mid - 1;
            else left = mid + 1;
        }
        return right+1+k;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        System.out.println(kthmissing(arr, 5));
    }
}
