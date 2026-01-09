//package DSA In Java.PatternPrintting;
/*
 * 
 * Q19. Write a java program to print this pattern.

	*						*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*						*

 */
public class HolloSleepDiamond {
    public static void main(String[] args) {
        for(int i = 1; i <= 13; i++)
	    {
			for(int j = 1; j <= 13; j++)
			{
				if((j == 1 || j == 13) && i % 2 != 0) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("         ");
				}
			}
			System.out.println();
		
		}
       
    }
}
