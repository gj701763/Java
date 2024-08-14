abstract  class parent {
    abstract public void gretting();
}

class child extends parent {

    @Override
    public void gretting() {
        System.out.println("Say Good Morning !!! ");
    }
    
}

public class Abstracts {
    public static void main(String args[]) {
        child c = new child();
        c.gretting();
    }

    
}
