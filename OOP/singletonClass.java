package OOP;


class S{
    private static S s1 = null;
    private S()
    {
        System.out.println("I am a Constructor");
    }

    public static S getInstance()
    {
        if(s1 == null)
        {
            s1 = new S();
        }
        return s1;
    }
}   
public class singletonClass {
    public static void main(String[] args) {
        S s1 = S.getInstance();
        //S s2 = S.getInstance();
        //S s3 = S.getInstance();
    }
}
