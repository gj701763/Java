class marks {
    public int math = 99;
}

class resutl extends marks {
    public int math = 98;
    void display() {
        System.out.println("Marks of math is : "+super.math);
    }
}
public class SuperVariables {
    public static void main(String args[]) {
        resutl r = new resutl();
        r.display();
    }
}
