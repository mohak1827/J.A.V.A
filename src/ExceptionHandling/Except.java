package ExceptionHandling;

public class Except
{
    public static void main(String[] args)
    {
        int i = 0;
        int j = 19;

        //j = j/i;    // error (Exception - Arithmetic exception / by zero), will stop execution here

        // instead we can say it to try first, and if it's not working at runtime or giving error at runtime, then don't stop the execution, run the other block

        try     // will try to execute the statement
        {
            j = j/i;

            // if any exception is found then it will jump out of the block and will not try to run further in the try block

            // if we are not handling the exception in catch block, then also it will not execute further and gives error
            System.out.println("hii");
        }
        // every exception extends the Exception class
        catch(Exception e)      // will execute if there's an exception
        {
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(j);
    }
}
