package ExceptionHandling;

public class Except2
{
    public static void main(String[] args)
    {
        int i = 2;
        int j = 19;

        int[] arr = new int[5];
        try     // will try to execute the statement
        {
            j = j/i;    // if exception found, it will not execute further
            System.out.println(arr[0]);
            System.out.println(arr[5]);     // index out of bounds exception
            System.out.println("hii");
        }
//        catch(Exception e)      // will execute if there's an exception
//        {
//            System.out.println("Something went wrong...");  // we are printing the same thing for every exception,
//        }

        // exception specific
        catch(ArithmeticException e)       // will only handle arithmetic exception
        {
            System.out.println("divide by zero");
        }

        // will not execute this statement as index out of bounds is not being handled
        System.out.println(j);
    }
}
