package Threads;

// race condition - when two objects are trying to access same resource at the same time

//class Counter
//{
//    public int count;
//    public void increment()
//    {
//        count++;
//    }
//}
//public class RaceCondition
//{
//    public static void main(String[] args)
//    {
//        Counter c = new Counter();
//        Runnable obj1 = () ->
//        {
//            for(int i = 1; i <= 1000; i++)
//            {
//                c.increment();
//            }
//        };
//        Runnable obj2 = () ->
//        {
//            for(int i = 1; i <= 1000; i++)
//            {
//                c.increment();
//            }
//        };
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();
//
//        System.out.println(c.count);    // it will always give zero or incorrect value as main doesn't wait for the thread to complete their execution
//    }
//}


        // using join (main will wait until the execution completes)

//class Counter
//{
//    public int count;
//    public void increment()
//    {
//        count++;
//    }
//}
//public class RaceCondition
//{
//    public static void main(String[] args) throws InterruptedException {
//        Counter c = new Counter();
//        Runnable obj1 = () ->
//        {
//            for(int i = 1; i <= 1000; i++)
//            {
//                c.increment();
//            }
//        };
//        Runnable obj2 = () ->
//        {
//            for(int i = 1; i <= 1000; i++)
//            {
//                c.increment();
//            }
//        };
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        // it still will not give correct output many times
//
//        // there may be situations where they both were accessing the count at the same time, in that case the iterations would be two but the increment was only 1
//        System.out.println(c.count);
//    }
//}



        // using synchronized

class Counter
{
    public int count;
    public synchronized void increment()        // if one object is accessing/working increment noone can call it
    {
        count++;
    }
}
public class RaceCondition
{
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () ->
        {
            for(int i = 1; i <= 1000; i++)
            {
                c.increment();
            }
        };
        Runnable obj2 = () ->
        {
            for(int i = 1; i <= 1000; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}