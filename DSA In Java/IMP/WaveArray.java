public class WaveArray {

    public static void printArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Keep merge standard to ensure the array actually gets sorted
    public static void merge(int a[], int b[], int arr[]) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) { // Standard sorting condition
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }

        while (i < a.length)
            arr[k++] = a[i++];
        while (j < b.length)
            arr[k++] = b[j++];
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return; // Base case fix
        int a[] = new int[n / 2];
        int b[] = new int[n - n / 2];
        int idx = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];

        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 4, 4, 4, 4 };
        int n = arr.length;

        // 1. Sort the array: Result is {4, 4, 4, 4, 5, 5, 5}
        mergeSort(arr);

        // 2. In-place rearrangement logic
        // We want the 5s (which start at index 4) to move to indices 1, 3, 5
        int largeStart = (n + 1) / 2; // Index where 5s begin

        for (int i = 1; i < n; i += 2) {
            if (largeStart < n) {
                // We need to move arr[largeStart] to arr[i]
                // and shift everything in between to keep it sorted/organized
                int valToMove = arr[largeStart];

                // Shift elements to the right to make room at index i
                for (int k = largeStart; k > i; k--) {
                    arr[k] = arr[k - 1];
                }

                arr[i] = valToMove;
                largeStart++;
            }
        }

        // Output: 4 5 4 5 4 5 4
        printArray(arr);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}