public class Replace {
    public static void main(String[] args) { // A defanged IP address replaces every period "." with "[.]".
        String str = "1.1.1.1";
        String defanged = str.replace(".", "[.]");
        System.out.println(defanged);
    }
}
