//Write a java program to display 1 to nth Prime Number.

public class Gst {

    
    public static void main(String[] args) {
    
        int arr[] = new int[5];
        int n = 5;
        while(n > 0)
        {
            arr[n] = n;
            n--;
        }

        System.out.println(arr[n]);
    }
}
