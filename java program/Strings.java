import java.util.*;
public class Strings {
    public static void main(String args[]) {
        // Concatenation
        Scanner sc = new Scanner(System.in);
        String firstName = "Gajanan";
        String lastName = "Jadhav";
        String fullName = firstName + " "+ lastName;
        // Find the Lenght of fullName
        // lenght()
        //System.out.println("Your FullName lenght is  : "+ fullName.length());

        // Print the Index of Lenght
        // charAt()
        // for(int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        // Print the Character of Name
        // indexOf();
       // System.out.println(fullName.indexOf('j'));

        // campareTo();
        // System.out.println(firstName.compareTo(lastName));
        
        // contains()
        // System.out.println(fullName.contains("Ga"));

        // startswidth(), endswith()
       //  System.out.println(fullName.startsWith("Ga"));
        // System.out.println(fullName.endsWith("na"));
         
        // toLowerCase(), toUpperCase()
        //System.out.println(fullName.toLowerCase());
        //System.out.println(fullName.toUpperCase());

        // concat()
        //System.out.println(firstName.concat(lastName));
        String s = "Gajanan";
        for(int i = 2; i < 5; i++) {
            System.out.print(s.substring(i));
        }
    }
}
