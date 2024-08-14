//                Hierarchical Inheritance

//                              Class A
//                             /         \
//                            /           \
//                      Class B             Class C
//                     /      \             /     \
//                    /        \           /       \
//                 Class D    Class G  Class E   Class

import java.util.Scanner;


class Values {
    int n;
    public void getdata() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your no is : ");
            n = sc.nextInt();
        }
    }
}
class Area extends Values {
    public void squeare() {
        System.out.println("Area of squeare is : "+ (n * n));
    }
}

class Areas extends Values {
    public void cube() {
        System.out.println("Area of Cube is : "+ (n * n * n));
    }
}
public class HierarchicalInheriance {
    public static void main(String args[]) {
       //Area a = new Area();
      // a.getdata();
      // a.squeare();
       Areas as = new Areas();
       as.getdata();
       as.cube();
       return;
    }
}
