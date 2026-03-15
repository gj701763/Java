/*
Q2. Write a java program to print this pattern. 
 
1                 1 
1 2             2 1 
1 2 3         3 2 1 
1 2 3 4     4 3 2 1 
1 2 3 4 5 5 4 3 2 1
*/

public class Questions {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++)
        {
           int k = 5;
            for(int j = 1; j <= 10; j++)
            {
                if(j <= 5 && j <= i)
                {
                    System.out.print(j + "  ");  
                }else if((j >= 6 && i + j >= 11))
                {
                    System.out.print(k + "  ");
                }else{
                    System.out.print("   ");
                   
                }
                if (j >= 6) {
                    k--;
                }
                
            }
            System.out.println();
        }
    }
    
}
