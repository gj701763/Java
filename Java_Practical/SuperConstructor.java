class Father {
    Father() {
        System.out.println("Father Constructor is called !!!");
    }
}

class child extends Father {
    child() {
        super();
        System.out.println("Child Constructor is called !!!");
    }
}

public class SuperConstructor {
    public static void main(String args[]) {
         new child();
        
    }
}
