// Find the Minimum Element out of all the maximum element of each row 

public class FindTheMinOfMaxRow {
    public static void main(String[] args) {
        int arr[][] = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,4,2,4}};

        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int maxValue = Integer.MIN_VALUE;
            for(int j = 0; j < arr[0].length; j++) {
                maxValue = Math.max(maxValue, arr[i][j]);
            }

            minValue = Math.min(minValue, maxValue);
        }

        System.out.println(minValue);   
    };
}