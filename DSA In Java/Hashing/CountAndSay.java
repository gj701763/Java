import java.util.*;
public class CountAndSay {

    public static String countAndSay(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        if(n == 1) return Integer.toString(n);
            int ch = 1;
            int count = 0;
            count++;
            ch++;
            map.put(count, ch);
            sb.append(map);
        
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of n is : ");
        int n = sc.nextInt();

        String str = countAndSay(n);
        System.out.println(str.toString());
        sc.close();
    }
}
