class Teacher {
    public void study() {
        System.out.println("Called the teacher funtion !!!"); 
    }
}

class Student extends Teacher {
    public void study() {
        System.out.println("Called the student funtion !!!");
    }

    void display() {
        //study();
        super.study();
    }
}

public class SuperMethod {
    public static void main(String args[]) {
        Student s = new Student();
        s.display();
    }
}
