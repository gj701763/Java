// Print elements of 2D array in Column Wise
public class PrintInColumnWise {
    public static void main(String[] args) {
        int arr[][] = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,4,2,4}};
       for (int i = 0; i < arr[0].length; i++) {
            // Inner loop for rows
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
