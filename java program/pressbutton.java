import java.util.*;

public class pressbutton {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your Button is : ");
            int button = sc.nextInt();
            // if(button == 1){
            //     System.out.println("Jay Shri Ram");
            // }
            // else if(button == 2){
            //     System.out.println("Jay ShivRay");
            // }
            // else{
            //     System.out.println("Shri Hari Vittal");
            // }

            switch(button){
                case 1 : System.out.println("Jay shri Ram");
                break;
                case 2 : System.out.println("Jay Shivray");
                break;
                case 3 : System.out.println("Shri Hari Vittal");
                break;
                default : System.out.println("Invalid Button");

            }
            


        }
    }
    
}
