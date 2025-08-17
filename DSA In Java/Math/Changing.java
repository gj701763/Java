public class Changing {


    public static int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';  // change the first '6' to '9'
                break;            // only one change allowed
            }
        }

        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        int num = 9669;
        int str = maximum69Number(num);
        System.out.println(str);
    }
}
