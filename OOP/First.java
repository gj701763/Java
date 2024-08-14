
class Number {
    int a;
    int b;
    public void setdata(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void getdata() {
        System.out.println(" A is : "+ a);
        System.out.println(" B is : "+ b);
    }
}

public class First {
    public static void main(String args[]) {
        Number n = new Number();
        n.setdata(4,5);
        n.getdata();
    }
}
