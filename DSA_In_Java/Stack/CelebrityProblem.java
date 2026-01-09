public class CelebrityProblem {
    public static void main(String[] args) {
        int arr[][] = {
            {1,1,1,1,1},
            {0,1,0,1,0},
            {1,0,1,1,1},
            {0,0,0,1,0},
            {1,1,0,1,1}
        };
        int n = arr.length;
        int celebrity = -1;

        for (int i = 0; i < n; i++) {
            boolean iIsCelebrity = true;

            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue; 
                if (arr[i][j] == 1 || arr[j][i] == 0) {
                    iIsCelebrity = false;
                    break;
                }
            }

            if (iIsCelebrity) {
                celebrity = i;
                break;
            }
        }

        if (celebrity == -1) {
            System.out.println("No Celebrity found");
        } else {
            System.out.println("Celebrity is at index: " + celebrity);
        }
    }
}
