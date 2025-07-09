/*
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
   You should return the array of nums such that the the array follows the given conditions:

   Every consecutive pair of integers have opposite signs.
   For all integers with the same sign, the order in which they were present in nums is preserved.
   The rearranged array begins with a positive integer.
   Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
   Example 1:

   Input: nums = [3,1,-2,-5,2,-4]
   Output: [3,-2,1,-5,2,-4]
 */

//import InterviewQue.String.string;
import java.lang.Integer;
import java.util.*;
import java.util.Arrays;

public class ArragePo {

  public static int[] rearrangeArray(int arr[]) {
    int n = arr.length;
    List<Integer> pos = new ArrayList<>();
    List<Integer> ne = new ArrayList<>();

    for(int num : arr) {
      if(num > 0) {
        pos.add(num);
      }else{
        ne.add(num);
      }
    }

    int i = 0, po = 0, neg = 0;
    while(i < n) {
      arr[i++] = pos.get(po);
      arr[i++] = ne.get(neg);
    }

    return arr;
  }

  public static void main(String[] args) {
    int arr[] = {3,1,-2,-5,2,-4};
    System.out.println(Arrays.toString(rearrangeArray(arr)));
  }
    
}
