
public class BinarySearch_firth_orr {

    private static int binarySearchFirstO(int arr[], int tar) {
        int n = arr.length, left = 0, right = n - 1, idx = -1;
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == tar) {
                idx = mid;
                right = mid - 1;
            } else if (arr[mid] > tar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 7, 6, 6, 3, 2, 1 };
        System.out.println(binarySearchFirstO(arr, 6));
    }
}
