package Tacks;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int minimum_range = 1;
            int maximum_range = 100;
            int generated_Num;
            int attempts = 5;
            int score = 0;

            boolean playAgain = true;
            System.out.println("Hi Welcome to Guessing Games !!! "); 
            while(playAgain) {
                generated_Num = rand.nextInt(maximum_range - minimum_range +1) + minimum_range;
                attempts = 0;
                System.out.println("I have generated the number between "+ minimum_range+ " and  "+ maximum_range);
                System.out.println("Can you Guess the Number ??? : ");
                while(true) {
                    System.out.println("Please Enter you Guess : "); 
                    int userGuess = sc.nextInt();
                    attempts++;
                    if(userGuess == generated_Num) {
                        System.out.println("Wow Congrats !! You guessed the correct number in "+attempts+"attempt");
                        score++;
                        break;
                    }
                    else if(userGuess < generated_Num) {
                        System.out.println("Oops , This number is too Low ! try again");
                    }else {
                        System.out.println("Oops , this number is too high try again");
                    }
                }
                System.out.println("Are you ready for the next try ??? (yes/no) : ");
                String choice = sc.next();
                if(!choice.equalsIgnoreCase("yes")) {
                    playAgain = false;
                }
            }
            System.out.println("The Game is ended !!!");
            System.out.println("Your final score is : "+score);
        }
    }
}
