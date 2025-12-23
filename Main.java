
class Main 
{
    public static void merge2(int[] arr1, int m, int[] arr2, int n)
    {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {

            if (arr1[i] >= arr2[j]) 
            {
                arr1[k--] = arr1[i--];

            } else 
            {
                arr1[k--] = arr2[j--];
            }
        }

        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
        for(int num : arr1)
        {
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1,2,3,4,0,0,0,};
        int[] arr2 = {2,5,6};
        int count = 0;
        for(int num : arr1)
        {
            if(num == 0) break;
            count++;
        }
        int n = arr2.length;
        merge2(arr1,count, arr2, n);
    }
}