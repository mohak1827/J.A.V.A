package interfaces;

interface X
{
    void show();
    void config();
}
interface Y
{
    void run();
}
interface F extends Y
{
    // inherited all the methods of Y
}

// class Z implements F // have to implement the inherited methods too (run)

class Z implements X,Y  // implementing multiple interfaces
{
    // have to define all the methods of all the interfaces

    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("running..");
    }
}
public class multipleInheritance
{
    public static void main(String[] args)
    {
        X obj;
        obj = new Z();
        obj.show();
        obj.config();

        //obj.run();  // cannot call method run(object is reffering to X and X does not have any method run)

        Y obj1 = new Z();
        obj1.run();
        // obj1.show();  // here we can't call show as the object is of Y
    }
}
