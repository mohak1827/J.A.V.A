package ExceptionHandling;

// if we don't want to handle the exception in the method, we use throws keyword, what it will do is whoever calling that method have to handle the exception there

//public class Throws
//{
//    public static void main(String[] args)
//    {
//        //Class.forName("Calc5678");     // checked exception (must be handled)
//        try{
//            Class.forName("Calc5678");
//        } catch (ClassNotFoundException e) {
//            System.out.println("not able to find the class " + e);
//        }
//    }
//}

class A
{
    public void show() throws ClassNotFoundException    // not responsible for handling the exception
    {
        Class.forName("ExceptionHandling.calculator");
    }
}
public class Throws
{
    public static void main(String[] args)
    {
        A obj = new A();
        // obj.show();    // unhandled exception error(exception must be handled here)
        try{
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            //e.printStackTrace();
            System.out.println("not able to find the class " + e);
        }
    }
}