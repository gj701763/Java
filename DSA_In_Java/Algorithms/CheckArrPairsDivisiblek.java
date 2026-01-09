//Check If Array Pairs Are Divisible by k
public class CheckArrPairsDivisiblek {
    public static boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for (int num : arr) {
            int rem = ((num % k) + k) % k;
            freq[rem]++;
        }
        for (int i = 0; i < k; i++) {
            if (i == 0) {
                if (freq[i] % 2 != 0)
                    return false;
            } else if (i * 2 == k) {
                if (freq[i] % 2 != 0)
                    return false;
            } else {
                if (freq[i] != freq[k - i])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,10,6,7,8,9}, k = 5;
        System.out.println(canArrange(arr, k));
    }
}
