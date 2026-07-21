package innerClass;
class X
{
    public void show()
    {
        System.out.println("in a Show");
    }
}
public class anonymousInnerClass
{
    public static void main(String[] args)
    {
        X obj = new X()     // if we want some different implementation, we can directly implement here instead of creating a inherited class for only a specific functionality
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
