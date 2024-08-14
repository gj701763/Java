package Tacks;
import java.util.*;

public class Student {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the number of Subjects : ");

            int n = sc.nextInt();
            int total = 0;

            for(int i = 1; i <= n; i++) {
                
                System.out.println("Enter your Marks is : ");
                int marks = sc.nextInt();
                total = total + marks;
            }

            double Avg = (double)total / n;
            char grade = ' ';

            if(Avg >= 90) {
                grade = 'A';
            }
            else if (Avg >= 80) {
                grade = 'B';
            }
            else if(Avg >= 70) {
                grade = 'C';
            }
            else if(Avg >= 60) {
                grade = 'D';
            }
            else{
                grade = 'E';
            }

            System.out.println("Total Mark : "+total);
            System.out.println("Average Percentage : "+Avg);
            System.out.println("Grage : "+grade);
        }
    }
}
