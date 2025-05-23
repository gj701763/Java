package InterviewQue.String;

public class string {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "gaju";

        StringBuffer result = new StringBuffer();

        int i = 0;
        int j = 0;

        while (i < s1.length() || j < s2.length()) {
            if (i < s1.length()) {
                result.append(s1.charAt(i));
                i++;
            }
            if (i == 2 && j < s2.length()) { // add s2[1] after s1[1]
                result.append(s2.charAt(1));
                j = 2; // skip s2[0] and move to s2[2]
            } else if (j >= 2 && j < s2.length()) {
                result.append(s2.charAt(j));
                j++;
            }
        }

        System.out.println(result.toString()); // Output: jaavjau
    }
}
