//package Strings in java;
import java.util.*;

public class remove {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your string is : ");
            String str = sc.nextLine();
            String s = "";
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != 'a') {
                    s += str.charAt(i);
                }
                //System.out.println(str);
            }
            System.out.println(s);
        }
    }
    
}
