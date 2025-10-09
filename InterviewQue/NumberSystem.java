package InterviewQue;
/*
 * 
Prime number, perfect number, armstrong number, duck number, 
happy number, spy number, strong number, palindrome number, reverse number,
Q. 1    check a single number
Q. 2 Display from 1 to n


 */

import java.util.Scanner;

public class NumberSystem {
    private static boolean isprime(int num)
    {
        for(int i = 2; i * i <= num; i++) 
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    private static boolean isPerfect(int num)
    {
        int sum = 0;
        for(int i = 1; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        if(sum == num)
        {
            return true;
        }
        return false;
    }

    private static boolean isArmstrong(int num)
    {
        int count = 0, sum = 0;
        int temp = num;
        while(num != 0)
        {
            count++;
            num /= 10;
        }
        num = temp;
        while(temp != 0)
        {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        if(num == sum)
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number from user : ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n)
        {
            if(isArmstrong(i))
            {
                System.out.print(i+" ");
            }
            i++;
        }

        sc.close();
    }
}
