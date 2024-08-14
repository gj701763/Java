class oop {
    public void show() {
        System.out.println("Show the oop class !!!");
    }
}

class object extends oop {
    public void show() {
        System.out.println("Show the object class !!!");
    }
}

class Classes extends object {
    public void show() {
        System.out.println("Show the classes !!!");
    }
}

public class Methodoverriding {
    public static void main(String args[]) {
        oop c = new Classes();
        c.show();
    }
}
