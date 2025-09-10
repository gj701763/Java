public class SnakePattern {
    public static void main(String[] args) {
        int arr[][] = {
            {2, 8, 3, 4, 7},
            {7, 2, 1, 6, 3},
            {5, 5, 4, 1, 4},
            {3, 1, 4, 2, 4}
        };

        for (int i = 0; i < arr.length; i++) {
            // // if (i % 2 == 0) { // left to right
            //     for (int j = 0; j < arr[i].length; j++) {
            //         System.out.print(arr[i][j] + " ");
            //     }
            // // } else { // right to left
                for (int j = arr[i].length - 1; j >= 0; j--) {
                   System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            
        }
}
