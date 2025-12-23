//package DSA In Java.PriorityQueue;

import java.util.PriorityQueue;


public class LastStoneWeight {
    
    public static int lastEle(int arr[])
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for(int num : arr)
        {
            maxHeap.add(num);
        }
        
        while (maxHeap.size() > 1) 
        {
            int y = maxHeap.poll(); 
            int x = maxHeap.poll();
            int difference = y - x;
            if (difference > 0) 
            {
                maxHeap.add(difference);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
    public static void main(String[] args) {
        int arr[] = {2,7,4,1,8,1};
        System.out.println(lastEle(arr));
    }
}
