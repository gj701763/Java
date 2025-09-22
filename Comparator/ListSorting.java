import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [roll = " + roll + ", name = " + name + "]";
    }
}

public class ListSorting {
    public static void main(String[] args) {
        List<Student> n = new ArrayList<>();
        n.add(new Student(18, "Gajanan"));
        n.add(new Student(34, "Gajanan"));
        n.add(new Student(13, "Gajanan"));
        n.add(new Student(45, "Gajanan"));
        n.add(new Student(24, "Gajanan"));
        n.add(new Student(15, "Gajanan"));

        // Sort by roll number
        Collections.sort(n, (a, b) -> Integer.compare(b.roll, a.roll));

        for (Student s : n) {
            System.out.println(s);
        }
    }
}
