package Tacks;
import java.util.*;

public class Atm_Interface {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int balance = 10000, withdraw, deposit;
            while(true) {
                System.out.println("Automated Teller Machine : ");
                System.out.println("Choose 1 for withdraw : ");
                System.out.println("Choose 2 for Deposit : ");
                System.out.println("Choose 3 for Check Balance : ");
                System.out.println("Choose 4 Exit : ");
                System.out.println("Choose the operation you want to perform : ");

                int choice = sc.nextInt();
                switch(choice) {
                    case 1: 
                        System.out.println("Enter money to be withdraw : ");
                        withdraw = sc.nextInt();
                        if(balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Please collect you money : ");
                        } else {
                            System.out.println("Insufficient Balance : ");
                        }
                         System.out.println("");
                        break;

                    case 2:
                        System.out.println("Enter money to be deposited : ");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited : ");
                        System.out.println("");
                        break;
                    
                    case 3:
                        System.out.println("Balance : "+ balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("");
                        System.exit(0);

                }
            }
        }
    }
}
