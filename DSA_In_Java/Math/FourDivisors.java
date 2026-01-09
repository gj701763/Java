/*
1390. Four Divisors : https://leetcode.com/problems/four-divisors/

Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. If there is no such integer in the array, return 0.
*/

public class FourDivisors {

    public static int sumFourDivisors(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            int count = 0;
            for (int j = 1; j * j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    if (j * j == arr[i]) {
                        count++;
                        currentSum += j;
                    } else {
                        count += 2;
                        currentSum += j + (arr[i] / j);
                    }
                }
                if (count > 4)
                    break;
            }
            if (count == 4) {
                sum += currentSum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 21, 4, 7 };
        System.out.println(sumFourDivisors(arr));
    }
}
