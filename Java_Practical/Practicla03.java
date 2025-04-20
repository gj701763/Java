//  Implementation Of Multiple Inheritance Using Interfaces In JAVA

interface Circle {
    void areaOfcircle(int r); // r = redius
}

interface Triangle {
    void areaoftriangle(int b, int h); // b = base , h = height
}

interface Rectangle {
    void araofrectangle(int l, int w); // w = Width, l = lengh
}

class Display implements Circle, Triangle, Rectangle {

    public void areaOfcircle(int r) { // implements Circle interfaces
        double area = (3.14 * r * r);
        System.out.println("Area of Circle is : " + area);
    }

    public void areaoftriangle(int h, int b) { // implements Triangle interfaces
        double area = (0.5 * h * b);
        System.out.println("Area of Triangle is : " + area);
    }

    public void araofrectangle(int w, int l) { // implements Rectangle interfaces
        double area = (w * l);
        System.out.println("Area of Rectangle is : " + area);
    }
}

public class Practicla03 {
    public static void main(String args[]) {
        Display d = new Display(); // object of Display class
        d.areaOfcircle(3);
        d.areaoftriangle(2, 8);
        d.araofrectangle(4, 9);
    }

}
