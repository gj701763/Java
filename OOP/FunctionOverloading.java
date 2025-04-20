class Volume {
    public void volume(int r) {
        double cirlce = (2 * 3.14 * r);
        System.out.println("Volume of cirle is : "+ cirlce);
    }

    public void volume(int l, int b , int h) {
        float cube = (l * b * h);
        System.out.println("Volume of cube is : "+ cube);
    }

    public void volume(int r, int h) {
        double sphere = (3/4 * r * r * h);
        System.out.println("Volume of sphere is : "+ sphere);
    }
}

public class FunctionOverloading {
    public static void main(String args[]) {
        Volume v = new Volume();
        v.volume(4);
        v.volume(3,5);
        v.volume(3,9,8);
    }
}
