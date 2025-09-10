public class New {

    public static int binarySearch(int arr[], int tar) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left <= right) { 
            int mid = left + (right - left) / 2;

            if(arr[mid] == tar) {
                return mid;
            }else if (arr[mid] > tar) {
                right = mid - 1;
            }else{
                left = mid+1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
       int arr[] = {2,4,6,8,9,77,88};
       System.out.println(binarySearch(arr, 88));
    }
}
