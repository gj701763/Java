import java.util.ArrayList;
import java.util.List;

public class JustOneMiss {

    public static List<Boolean> prefixesDivBy5(int[] arr) 
    {
        List<Boolean> list = new ArrayList<>();
        int curr = 0;
        for(int i = 0; i < arr.length; i++) 
        {
            curr = arr[i] << 1;
            curr += arr[i];
            if(curr % 5 == 0) 
            {
                curr = 0;
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1};
        System.out.println(prefixesDivBy5(arr));
    }
}
