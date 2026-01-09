import java.util.Scanner;

public class LookAndSayPattern {
    public static String countToSay(int n) {
        // Base Case
        if (n == 1)
            return "1";
        String s = countToSay(n - 1);
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while (j < s.length()) 
        {
            if (s.charAt(i) == s.charAt(j)) j++;
             else 
            {
                int fre = j - i;
                ans.append(fre);
                ans.append(s.charAt(i));
                i = j;
            }
        }
        int fre = j - i;
        ans.append(fre);
        ans.append(s.charAt(i));

        return ans.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            System.out.println("Result: " + countToSay(n));
        }
    }
}