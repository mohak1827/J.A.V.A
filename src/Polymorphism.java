//class A
//{
//    public void show()
//    {
//        System.out.println("in A show");
//    }
//
//    public void config()
//    {
//        System.out.println("in A config");
//    }
//}
//
//class B extends A
//{
//    public void show()
//    {
//        System.out.println("in B show");
//    }
//}
//public class Polymorphism
//{
//    public static void main(String[] args)
//    {
//        B obj = new B();
////        obj.show();     // prints - in A show
////        obj.config();   // prints - in A config
//
//        // after method overriding
//        obj.show();     // prints - in B show
//        obj.config();
//    }
//}



class Subtract
{
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}

class Difference extends Subtract
{
    public int sub(int n1, int n2)
    {
        return Math.abs(n1-n2);
    }
}
public class Polymorphism
{
    public static void main(String[] args)
    {
        Difference dif = new Difference();
        int r1 = dif.sub(5,7);      // before -> returns -2
        // System.out.println(r1);

        // after method overriding
        System.out.println(r1);     // return 2
    }
}
