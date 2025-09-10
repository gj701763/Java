public class RowWithMaxSum {
    public static void main(String[] args) {
        int arr[][] = {{3,4,1,5,4},{3,5,1,7,9},{8,5,1,9,5}};
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i; // store row index
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Row Number  = " + (rowIndex + 1)); // +1 for human-friendly indexing
    }
}
