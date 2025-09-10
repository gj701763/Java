public class SearchIn2Darr {

    public static boolean searc2D(int arr[][], int tar) {
        int row = 0;
        int n = arr.length;
        int col = arr[0].length-1;
        while (row < n && col >= 0) {
            if(arr[row][col] == tar) {
                return true;
            }else if(arr[row][col] > tar) {
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searc2D(arr, 120));
    }
}
