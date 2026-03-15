import java.util.Collections;
import java.util.PriorityQueue;

public class Basics {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        int arr[] = { 5, 3, 6, 3, 1, 8, 6 };

        for (int x : arr) {
            p.add(x);
            pr.add(x);
        }
        System.out.println("order!!!");
        while (!p.isEmpty()) {
            System.out.print(p.peek() + " "); 
            p.poll(); 
        }

        System.out.println("\nreverse Order !!!");
        while (!pr.isEmpty()) {
            System.out.print(pr.peek() + " "); 
            pr.poll(); 
        }
    }
}