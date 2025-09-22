public class ColumnTitle {
    public static void main(String[] args) {
        String str = "a";
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // int val = ch - 'A' + 1;   // 'A'=1, 'B'=2 ... 'Z'=26
            // num = num * 26 + val;
            int val = ch;
            System.out.println(val);
        }
        
        System.out.println(num);
    }
}
