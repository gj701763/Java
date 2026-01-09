public class JumpGame {

    public static boolean canJump(int arr[]) {
        int n = arr.length;
        int maxReach = 0;
        for(int i = 0; i <= n; i++) {

             if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i+arr[i]);
            if( maxReach >= n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,1,1,4};
        System.out.println(canJump(arr));
    }
}
