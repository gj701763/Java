public class StringBui {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Gaju");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'r');
        System.out.println(sb);
        // insert the 'n'
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
