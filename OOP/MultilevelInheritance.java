package OOP;

//                MultiLevel Inheritance

//                    Base class
//                        |
//                        |
//                   Derived class
//                        |
//                        |
//                  Derived class
class Student {
    int roll_no;

    public void setdata(int r) {
        roll_no = r;
    }

    public void getdata() {
        System.out.println("The Roll no is : " + roll_no);
    }
}

class Exam extends Student {
    int math;
    int phy;

    public void setmark(int m, int p) {
        math = m;
        phy = p;
    }

    public void getmark() {
        System.out.println("The mark optain in math is : " + math);
        System.out.println("the mark optain in physics is : " + phy);
    }
}

class Result extends Exam {
    float percentage;

    public void display() {
        percentage = (math + phy) / 2;
        getdata();
        getmark();
        System.out.println("The Total Percentage is : " + percentage + " % ");
    
    }
}

public class MultilevelInheritance {
    public static void main(String args[]) {
        Result r = new Result();
        r.setdata(23);
        r.setmark(99, 97);
        r.display();
    }
}
