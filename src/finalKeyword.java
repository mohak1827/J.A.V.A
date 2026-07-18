// final - variable, method, class

public class finalKeyword
{
    public static void main(String[] args)
    {
        // final variable

        final int price = 200;  // makes variable constant
        //price = 250;    // can't change final variable value
    }
}


        // final class

//final class Cal    // stops inheritance
//{
//    public void show()
//    {
//        System.out.println("in Cal show");
//    }
//    public void add(int a, int b)
//    {
//        System.out.println(a+b);
//    }
//}
//class AdvCal extends Cal      // can't inherit final class
//{
//
//}


        // final method

class Cal
{
    public final void show()    // stops overriding
    {
        System.out.println("in Cal show");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class AdvCal extends Cal
{
//    public void show()      // can't override final method
//    {
//        System.out.println("in AdvCal show");
//    }
}