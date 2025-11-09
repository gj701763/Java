public class Factorials 
{
    public static void fact(int a)
    {
        int fact = 1;
        for(int i = 1; i <= a; i++)  // 5 * 4 * 3 * 2 * 1;
        {
            fact = fact * i;
        }
        System.out.printf("Factorials of %d is : %d", a,fact);
    }
    public static void main(String[] args) 
    {
        int a = 5;
        fact(a);
    }
}
