
/*
 * * * * * 
  * * * *  
 * * * *   
* * * *    
 */
public class PatternPrinting 
{
    // public static void main(String args[])
    // {
    //     for(int i = 1; i <= 4; i++)
    //     {
    //         for(int j = 1; j <= 7; j++)
    //         {
    //             if((j >= 5-i || j >= 8-i) && i+j < 9)
    //             {
    //                 System.out.print("* ");
    //             }else
    //             {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String args[])
    {
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 7; j++)
            {
                if(j == 8-i || j == 5-i || (i == 1 && j > 4) || (i == 4 && j < 5))
                {
                    System.out.print("* ");
                }else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
