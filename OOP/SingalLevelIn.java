//               Singal Level Inheritance
                
  //                     Base Class
   //                        |
  //                         |
 //                    Derived Class

 





class Base {
    int a;
    public void getdata(int a) {
        this.a = a;
    }
}

class Deried extends Base {
    public void setdata() {
        System.out.print("Value of A is : "+ a);
    }
}
public class SingalLevelIn {
    public static void main(String args[]) {
        Deried d = new Deried();
        d.getdata(4);
        d.setdata();
    }
}
