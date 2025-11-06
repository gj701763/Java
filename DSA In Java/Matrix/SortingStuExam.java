//package DSA In Java.Matrix;

public class SortingStuExam {
    private static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        // for (int i = 0; i < m - 1; i++) {
        //     int maxIndex = i;
        //     for (int j = i + 1; j < m; j++) {
        //         if (score[j][k] > score[maxIndex][k]) {
        //             maxIndex = j;
        //         }
        //     }
        //     if (maxIndex != i) {
        //         swap(score, i, maxIndex);
        //     }
        // }
    
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m-i-1; j++)
            {
                if(score[j][k] < score[j+1][k])
                {
                    swap(score, j, j+1);
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        // [10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2
        int[][] arr = { { 10, 6, 9, 1 }, { 7, 5, 11, 2 }, { 4, 8, 3, 15 } };
        int k = 2;
        int[][] ans = sortTheStudents(arr, k);
        print(ans);
    }
}
