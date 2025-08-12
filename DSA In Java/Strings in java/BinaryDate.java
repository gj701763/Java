
public class BinaryDate {

    public static void main(String[] args) {
        String date = "2080-4-12";

        String[] parts = date.split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            int num = Integer.parseInt(parts[i]);
            sb.append(Integer.toBinaryString(num));
            if (i < parts.length - 1) {
                sb.append("-");
            }
        }
        System.out.println(sb);
    }

}
