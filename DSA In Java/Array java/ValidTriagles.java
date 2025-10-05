import java.util.Arrays;

/*
 * 611. Valid Triangle Number
Given an integer array nums, return the number of triplets chosen from the array that can make 
triangles if we take them as side lengths of a triangle.
 */
public class ValidTriagles {

    public static int triangleNumber(int[] arr) {
        Arrays.sort(arr);     //  2 2 3 4
        int n = arr.length;
        int count = 0;
        for(int i = n-1; i > 0; i--) {
            int left = 0, right = i-1;
            while (left < right) {
                if(arr[left] + arr[right] > arr[i]) {
                    count += right - left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4};

        System.out.println(triangleNumber(arr));
    }
}
