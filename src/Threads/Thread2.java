package Threads;

// if we have to extend a class and we also want it to be a thread, we can't do as java doesn't support multiple inheritace
class X implements Runnable     // Thread class actually implements Runnable
{
    public void run()       // always should be a run method in thread
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);   // wait time
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Y implements Runnable
{
    public void run()
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Thread2
{
    public static void main(String[] args)
    {
//        X obj1 = new X();
//        Y obj2 = new Y();
//
//        //obj1.start();    // error, we can't call a method start because it belongs to Thread class
//
//        Thread t1 = new Thread();
//        Thread t2 = new Thread();
//
//        t1.start();
//        t2.start();

        // this will not give any output! but two threads will be created behind the scene
        // no output because t1 and t2 have no idea about obj1 and obj2, so we can pass the objects as parameter in thread as thread class has a constructor that accepts runnable objects, so we can create a reference of runnable and object of X and Y respectively

        Runnable obj1 = new X();
        Runnable obj2 = new Y();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
