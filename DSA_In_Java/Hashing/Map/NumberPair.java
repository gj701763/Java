package DSA_In_Java.Hashing.Map;

public class NumberPair {
    public static int numberOfPairs(int[] arr1, int[] arr2, int k) 
    {
        int count = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                int rem = arr2[j] * k;
                if(arr1[i] % rem == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4};
        int arr2[] = { 1, 3, 4};
        int k = 1;
        System.out.println(numberOfPairs(arr1, arr2, k));
    }
}
