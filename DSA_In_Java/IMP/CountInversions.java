

public class CountInversions 
{
    // Function to merge two sorted arrays and count split inversions
    public static int merge(int a[], int b[], int arr[])
    {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0, k = 0, res = 0;
        
        while(i < n1 && j < n2)
        {
            if(a[i] > b[j]) 
            {
                arr[k++] = b[j++];
                res += (n1 - i); 
            }
            else 
            {
                arr[k++] = a[i++];
            }
        }
        
        while(i < n1) arr[k++] = a[i++];
        while(j < n2) arr[k++] = b[j++];
        
        return res;
    }
    public static int mergeSort(int arr[]) 
    {
        int res = 0;
        int n = arr.length;
        
        
        if (n <= 1) 
            return 0; 
            
        int a[] = new int[n / 2];
        int b[] = new int[n - n / 2];
        int idx = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];
        
        res += mergeSort(a);
        res += mergeSort(b);
        res += merge(a, b, arr);
        
        return res;
    }
    
    public static void main(String[] args) {
        int arr[] = {4, 8, 5, 9, 2, 6};
        int r = mergeSort(arr);
        System.out.println(r); 
    }
}