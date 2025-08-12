public class ReverseString {

    public static void swap(String arr[], int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   public static void main(String[] args) {
    String s = "a good   example"   ;
    String[] part = s.trim().split("\\s+");
    int i = 0; 
    int j = part.length-1;
    while(i < j) {
        swap(part, i, j);
        i++;
        j--;
    }

    String joined = String.join(" ", part);
    System.out.println(joined); // the sky is blue
   } 
   
   
}
