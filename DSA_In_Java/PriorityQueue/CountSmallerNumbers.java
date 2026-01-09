/*

 */

import java.util.PriorityQueue;

public class CountSmallerNumbers {
    public static void main(String[] args) {
        // By default, PriorityQueue in Java is a Min-Priority Queue
        PriorityQueue<Integer> minHeap = new PriorityQueue<Collections.reverseOrder>();
        int arr[] = {5,2,6,1};
        int ans [] = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i++)
        { 
            if(minHeap.size() == 0){
                ans[i] = 0;
                minHeap.add(arr[i]);
            }else{
                if(minHeap.peek() < arr[i])
                {
                    ans[i] = minHeap.size();
                    minHeap.add(arr[i]);
                }
                while(minHeap.size() != 0 && minHeap.peek())
            }
        }

    }
}