import java.util.Scanner;


public class Pattern {
    public static void main(String args[]){

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your n is : ");
            int n = sc.nextInt();
            System.out.print("Enter your m is : ");
            int m = sc.nextInt();
            
          
          // 1) Solid Rectangle
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            
           // 2) Hollow Rectangle

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if(i == 1 || j == 1 || i == n || j == m){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


        }
        
        
    }
    
}
