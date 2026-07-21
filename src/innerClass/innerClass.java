package innerClass;
class A     // outer class can never be static
{
    int a = 10;
    public void show()
    {
        System.out.println("in a show");
    }
    static class B
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}
public class innerClass
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();

        //A.B obj1 = obj.new B();     // for a non-static inner class we need an object of outer class just like to call a non-static method requires an object of the class
        A.B obj1 = new A.B(); // only if B is static class
        obj1.config();
    }
}
