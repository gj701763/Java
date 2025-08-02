package Tacks;

public class New {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sort(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ans[idx++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                ans[idx++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                ans[idx++] = arr[i];
            }
        }

        print(ans);

        return ans;
    }

    public static void swap(int arr[], int r, int l) {
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
    }


    public static void sortNo(int arr[]) {
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if(arr[mid] == 1) {
                mid++;
            } else { 
                swap(arr, high, mid);
                high--;
            }
        }
        print(arr);
    }

    public static void main(String[] args) {
        int arr[] = {1,1, 0, 2, 1, 0, 0};
        sortNo(arr);
        sort(arr);
        
    }
}
