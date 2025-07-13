public class MergeToSortedArray {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge2arrNoExS(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n1 + n2 - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] >= arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // Copy any remaining elements from arr2
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }

        print(arr2);
    }

    public static void merge2arr(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int arr3[] = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        while (j < n2) {
            arr3[k++] = arr2[j++];
        }

        while (i < n1) {
            arr3[k++] = arr1[i++];
        }

        print(arr3);
    }

    public static void main(String[] args) {
        int arr2[] = { 1, 3, 5, 6, 7 };
        int arr1[] = { 2, 6, 8, 9, 10 };
        merge2arrNoExS(arr1, arr2);
    }
}
