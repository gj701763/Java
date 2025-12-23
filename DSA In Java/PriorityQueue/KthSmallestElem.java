//package DSA In Java.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElem 
{
    public static int kthSmallestElem(int arr[], int k)
    {
        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr)
        {
            pr.add(num);
            if(pr.size() > k)
            {
                pr.poll();
            }
        }
        return pr.peek();

    }
    public static void main(String[] args) {
        int arr[] = {5,1,7,3,9,4};
        int k = 3;
        System.out.println(kthSmallestElem(arr, k));
    }
    
}
