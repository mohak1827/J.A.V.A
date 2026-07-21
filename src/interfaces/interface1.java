package interfaces;
// interface just provides the desgin a class must implement
interface A
{
    // by default all the variables in an interface are final and static
    int age = 19;
    String name = "Mohak";

    void show();    // by default methods of interfaces are public and abstract
    void config();
}
class B implements A    // compulsory to define all the abstract methods here
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
}
public class interface1
{
    public static void main(String[] args)
    {
        A obj;  // can create a reference
        //obj = new A();  // can not instantiate the type A
        obj = new B();
        obj.show();
        obj.config();

        // A.age = 20;  // cannot assign a final variable
        System.out.println(A.age);  // static variables can be accessed through the interface
    }
}
