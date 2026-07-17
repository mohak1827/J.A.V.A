package accessModifiers;
import accessModifiers.Public.pub;
import accessModifiers.All;
class C extends pub
{
    public void show()
    {
        System.out.println(st);    // can access protected variable withint the derived or subclass
    }

}
public class Demo
{
    public static void main(String[] args)
    {
        pub obj = new pub();    // can create object of pub class as it is private
        // System.out.println(obj.marks);      // can't access marks outside the package as the marks variable is not public

        All obj1 = new All();
        System.out.println(obj1.mark);      // can access mark as it is in the same package
        // System.out.println(obj1.roll);      // can't access it despite being in the same package as it is private, (scope within the class only)

        System.out.println(obj1.mark);    // default access modifier, can be accessed within the package

        // System.out.println(obj.st);     // can't access as it is protected
    }
}

