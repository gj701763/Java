import java.util.Scanner;

public class StringEmailReplace {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your email : ");
            String email = sc.next();
            String username = " ";

            for(int i = 0; i < email.length(); i++) {
                if(email.charAt(i) == '@') {
                    break;
                }
                else {
                    username += email.charAt(i);
                }
            }
            System.out.println("Username : "+ username);
        }
    }
}
