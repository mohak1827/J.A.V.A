package ExceptionHandling;

//public class Throw
//{
//    public static void main(String[] args)
//    {
//        int i = 20;
//        int j = 18;
//
//        try{
//            j = 18/i;
//
//            // calling catch by ourself
//            if(j == 0)
//                throw new ArithmeticException();    // creating new object of arithmetic exception
//        }
//        catch(ArithmeticException e){
//            j = 18/1;   // handling the error
//            System.out.println("that's the default value");
//        }
//        catch (Exception e){
//            System.out.println("Something went wrong..");
//        }
//
//        System.out.println(j);
//    }
//}




        // passing message in throw

public class Throw
{
    public static void main(String[] args)
    {
        int i = 20;
        int j = 18;

        try{
            j = 18/i;

            // calling catch by ourself
            if(j == 0)
                throw new ArithmeticException("I don't want to print zero");    // passing the message
        }
        catch(ArithmeticException e){
            j = 18/1;   // handling the error
            System.out.println("that's the default value " + e); // will only print 'arithmetic exception' without any message if we don't pass any
        }
        catch (Exception e){
            System.out.println("Something went wrong..");
        }

        System.out.println(j);
    }
}