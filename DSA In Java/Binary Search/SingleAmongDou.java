public class SingleAmongDou {

    public static int singleAmongArr(int arr[]) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1])
                return arr[mid];
            int f, s;
            if (arr[mid - 1] == arr[mid]) {
                f = mid - 1;
                s = mid;
            } else {
                f = mid;
                s = mid + 1;
            }

            int leftC = f - left;
            // int rightC = right - s; // not really needed

            if (leftC % 2 == 0) {
                left = s + 1;
            } else {
                right = f - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6 };
        // int arr1[] = {2,2,1};
        System.out.println(singleAmongArr(arr));
    }
}
