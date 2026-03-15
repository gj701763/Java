package Leetcode;

public class P3823ReverseLettersThenSpecialCharacters {
    public static String reverseByType(String s) 
    {
        char arr[] = s.toCharArray();
        int left = 0, right = arr.length-1;
        while(left < right)
        {
            char cL = arr[left];
            char cR = arr[right];
            if(!Character.isLetter(cL)) left++;
            else if(!Character.isLetter(cR)) right--;
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        left = 0;
        right = arr.length - 1;
        while(left < right)
        {
            char cL = arr[left];
            char cR = arr[right];
            if(Character.isLetter(cL)) left++;
            else if(Character.isLetter(cR)) right--;
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = ")ebc#da@f(";
        System.out.println(reverseByType(s)); // ")fad#cb@e("
        // "(fad@cb#e)"
    }
}
