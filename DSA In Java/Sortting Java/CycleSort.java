public class CycleSort {
    /**
     * Finds the smallest missing positive integer in the array.
     * Assumes array contains numbers mostly in the range [1, arr.length + 1].
     */
    public static int cyclesort(int arr[]) {
        int n = arr.length + 1;
        int i = 0;

       
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
             
                swap(arr, i, correctIndex);
            } else {
                
                i++;
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Test Case 1: The original test case
        int arr1[] = { 1,3,5,2,3,1};
        int res1 = cyclesort(arr1);
        System.out.print("Input: {1} -> Missing: " + res1 + "\n"); // Expected: 2

        
    }
}