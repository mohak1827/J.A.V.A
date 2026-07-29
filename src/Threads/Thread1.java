package Threads;
// thread - multiple process(threads) inside a same software running at same time
class A extends Thread
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
class B extends Thread
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
public class Thread1
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);  // we can set priority of a thread either by using integer values from 0(lowest) to 10(highest) or we can use 'Thread' keyword
        // we always starts a thread
        obj1.start();   // calls run method
        try {       // wait time between two threads so that they are not reaching the scheduler at the same time
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}
