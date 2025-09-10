public class FloorIndexOfA {

    public static int floorBinary(int arr[], int tar) {
        int n = arr.length, low = 0, high = n-1, idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > tar) high = mid -1;
            else {
                idx = mid; 
                low = mid +1;
            } 

        }

        return idx;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,10,10,10,39,48};
        System.out.println(floorBinary(arr, 11));
    }
}
