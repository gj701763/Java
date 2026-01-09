
public class BinarySearch {

    public static int binarySearch(int arr[], int tar, int st, int end) {

        if(st <= end) {
            int mid = st + (end - st) / 2;

            if(arr[mid] == tar) {
                return mid;
            }
            if(arr[mid] < tar) {
                return binarySearch(arr, tar, mid+1, end);
            }else{
                return binarySearch(arr, tar, st, mid-1);
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1,3,6,8,34,66};
        int tar = 66;
        int n = arr.length;
        System.out.println(binarySearch(arr, tar, 0, n-1));
    }
}
