public class Gaju
{
     static String Employee_name;
     static float Employee_salary;

    static void set(String n, float s)
    {
        Employee_name = n;
        Employee_salary = s;
    }
    static void get()
    {
        System.out.println("Employee name is : " + Employee_name);
        System.out.println("Employee salari is : " + Employee_salary);
    }

    public static void main(String args[])
    {
        Gaju.set("Gajanan Jadhav",1002.0F);
        Gaju.get();
    }
}