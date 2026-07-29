package ExceptionHandling;

class MyException extends Exception
{
    public MyException(String string)
    {
        super(string);    // without calling the super method, it will not print the error message
    }
}
public class CustomException
{
    public static void main(String[] args)
    {
        int i = 20;
        int j = 18;

        try{
            j = 18/i;
            if(j == 0)
                throw new MyException("I don't want to print zero");
        }
        catch(MyException e)
        {
            j = 18/1;
            System.out.println("That's the default output " + e);
        }
    }
}
