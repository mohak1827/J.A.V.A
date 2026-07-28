package ExceptionHandling;

public class MultipleCatch
{
    public static void main(String[] args)
    {
        int i = 2;
        int j = 19;

        int[] arr = new int[5];

        String str = null;

        try
        {
            j = j/i;

            System.out.println(arr[0]);
            //System.out.println(arr[5]);

            System.out.println(str.length());

            System.out.println("hii");
        }
        // multiple catch blocks
        catch(ArithmeticException e)       // will only handle arithmetic exception
        {
            System.out.println("cannot divide by zero");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("out of bounds");
        }
        catch(Exception e)  // parent class, if you're not sure about what exception could be there, then as a precautionary we add parent exception class that handles every exception(must be at bottom)
        {
            System.out.println("Something went wrong.." + e);
        }
//        catch(NullPointerException e)   // error, unreachable catch block
//        {
//            System.out.println("null value");
//        }

        System.out.println(j);
    }
}
