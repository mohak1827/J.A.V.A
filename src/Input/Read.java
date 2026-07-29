package Input;

import java.io.IOException;

public class Read
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number");   // println is method of 'PrintStream' class

        // to call a method of a class we have to create an object of it.

        // we already have an object of 'PrintStream' class, and that is 'out'

        //'out' object belongs to 'System' class, and that object is static

        // so we call a static object 'out' with the help of its class name 'System' and as 'out' is object of 'PrintStream' class we call 'println' method


        //System.in.read();   // same as out we have 'in' object of 'InputStream' class but it might throw an exception and that too is checked exception so we must handle it
        // we can use try catch block or we can use throws at the main
//        try{
//            int num = System.in.read();
//            System.out.println(num);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        int num = System.in.read();     // it will give the ascii value
        System.out.println(num-48);

        // we can't read multiple character in read, or we have to use loop there
    }
}
