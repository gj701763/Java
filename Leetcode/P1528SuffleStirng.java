package Leetcode;
import java.util.*;

public class P1528SuffleStirng {
    public static String restoreString(String s, int[] arr) 
    {
        String str = " ";
        Map<Integer, Character> map = new TreeMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            char c = s.charAt(i);
            map.put(arr[i], c);
        }
        for(int n : map.keySet())
        {
            str += map.get(n);
        }

        return str;
    }

    public static String matrixSort(String s, int arr[])
    {
        String str ="";
        int mat[][] = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            char c = s.charAt(i);
            mat[i][0] = (int) c; // Store character as integer
            mat[i][1] = arr[i]; // Store the sorting weight
        }
        Arrays.sort(mat, (a, b) -> Integer.compare(a[1], b[1]));
        for (int i = 0; i < mat.length; i++) {
            str += ((char) mat[i][0]);
        }
        return str;
    }

    public static String restoreStringBest(String s, int[] indices) {
        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            // Place the character at its specific target index
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int arr[] = {4,5,6,7,0,2,1,3};
        System.out.println(matrixSort(s, arr));
        System.out.println(restoreStringBest(s,arr));
    }
}
