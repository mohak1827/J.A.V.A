package Annotations;

// An annotation in Java is metadata that provides additional information about a program (classes, methods, fields, parameters, etc.) without directly changing the program's execution.

//class A
//{
//    public void showTheDataWhichBelongsToThisClass()
//    {
//        System.out.println("in A show");
//    }
//}
//class B extends A
//{
//    public void showTheDataWhichBelongToThisClass()     // overriding(Bug)
//    {
//        System.out.println("in B show");
//    }
//}
//public class Annotation
//{
//    public static void main(String[] args)
//    {
//        B obj = new B();
//        obj.showTheDataWhichBelongsToThisClass();   // expecting to print the output in overridden method
//        // output is "in A show" but we were expecting it to be "in B show", this is because there's error in naming, that's why it is calling the method in superClass
//        // all these called bugs(logical problems)(you're something but got something else)
//        // for debugging, we can use annotations
//    }
//}


        // debugging with the help of annotations

class A
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
//    @Override   // gives error(we can easily debug while writing) | solving at compile time
//    // solving the bug at compile time is easier than solving the bug at runtime
//    public void showTheDataWhichBelongToThisClass()     // overriding(Bug)
//    {
//        System.out.println("in B show");
//    }

    @Override  // annotation
    public void showTheDataWhichBelongsToThisClass()     // overriding(Bug free)
    {
        System.out.println("in B show");
    }
}
public class Annotation
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}