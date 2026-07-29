package ExceptionHandling;

//public class Finally
//{
//    public static void main(String[] args)
//    {
//        int i = 0;
//        int j = 0;
//
//        try
//        {
//            j = 18/i;
//            //System.out.println("Bye");  // will not be executed as exception occurs
//        }
//        catch (Exception e)
//        {
//            System.out.println("Something went wrong..");
//        }
//        // finally block runs everytime irrespective of the exception
//        finally     // if we want to execute something regardless of any exception to be occurred we can write that in finally block
//        {
//            System.out.println("bye");
//        }
//    }
//}



        // try with finally (without catch)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finally
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        int num = 0;

        BufferedReader br = null;

        try
        {
            //InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(new InputStreamReader(System.in));

            num = Integer.parseInt(br.readLine());
            System.out.println(num);

            // we should always close the resources we are using
            //br.close();    // if we are handling an exception then we should not close a resource here as it might not executes
        }
        finally     // we mainly use try with only finally when we have to close some resource
        {
            br.close();    // closing the resource in finally block
        }

    }
}