package innerClass;
abstract class Y
{
    public abstract void show();
    public abstract void config();
}
public class concreteImplementation
{
    public static void main(String[] args)
    {
        // Y obj = new Y();    // can not instantiate object of an abstract class

        Y obj = new Y()     // but can create anonymous inner class and make an object for it
        {
            public void show()
            {
                System.out.println("in new show");
            }
            public void config()
            {
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}
