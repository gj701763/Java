package Map;

import java.util.HashMap;
import java.util.Map;

public class SubSetArr {

    public static boolean isSubset(int a[], int b[])
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : a)
        {
            map.put(n, map.getOrDefault(n, 0)+1) ;
        }
        for(int i = 0; i < b.length; i++)
        {
            if(map.containsKey(b[i]))
            {
                map.put(b[i], map.get(b[i])-1);
                if (map.get(b[i]) < 0) {
                    return false;
                }
            }else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[] = {11,7,1,13,21,71,3};
        int b[] = {11,3,7,1,7};
        int c[] = {1,2,3,4,4,5,6};
        int e[] = {1,2,4};
        int arr[] = {10,5,2,23,19};
        int brr[] = {19,5,3};
        System.out.println(isSubset(arr, brr));
    }
}

