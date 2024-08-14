/*   Write a function that takes in age as input and returns if that person is eligible
          to vote or not. A person of age > 18 is eligible to vote */

import java.util.Scanner;

public class Adult {
    public static void printvote(int age) {
        if(age > 18) {
            System.out.print("Eligible to vote !!!");
        }else if(age < 18) {
            System.out.print("is not Eligible to vote !!!");
        }else {
            System.out.print("not be Correct input !!!");
        }
        return;
    }

    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age is : ");
            int age = sc.nextInt();
            printvote(age);
        }
    }
}
