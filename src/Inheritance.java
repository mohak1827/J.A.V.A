//public class Inheritance
//{
//    public static void main(String args[])
//    {
// //        Calc cal = new Calc();
// //        System.out.println(cal.add(2,4));
//
//        AdvCalc adv = new AdvCalc();
//        int r1 = adv.add(3,4);  // can't use if not inherited
//        int r2 = adv.sub(8,3);
//        int r3 = adv.mul(5,3);
//
//        System.out.println(r1 + " " + r2 + " " + r3);
//    }
//}


class A
{
    public A()
    {
        System.out.println("in A");
    }

    public A(int n)
    {
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        // super()      // every constructor has a super() method by default which calls the constructor of superclass
        System.out.println("in B");
    }

    public B(int n)
    {
        //super(n);
        this();    // calls default constructor of B itself
        System.out.println("in B int");
    }
}
public class Inheritance
{
    public static void main(String args[])
    {
        B obj = new B();    // outputs - in A, in B

        // before modifying super
        // B obj1 = new B(5);  // outputs - in A, in B int

        // after modifying
        // B obj2 = new B(5);  // outputs - in A int, in B int

        // using this()
        B obj3 = new B(4);      // outputs - in A, in B, in B int
    }
}
