package enums;

// enums -> names constants(specific constants eg- error codes)

// every enum is a sub class of Enum class in java

enum Status     // basically it is a class
{
    Running, Failed, Pending, Success;  // and all these are objects
}

public class Enums
{
    public static void main(String[] args)
    {
        Status s = Status.Running;

        System.out.println(s.getClass().getSuperclass());

        System.out.println(s);
        System.out.println(s.ordinal());    // will give the order(index of it in the class)

        Status[] ss = Status.values();  // give array containing all the values present in status

        for(Status sVal: ss)
        {
            System.out.println(sVal + " : " + sVal.ordinal());
        }
    }
}

        // if-else statements with enums

//public class Enums
//{
//    public static void main(String[] args)
//    {
//        Status s = Status.Failed;
//
//        if(s == Status.Running)
//            System.out.println("All good");
//        else if(s == Status.Failed)
//            System.out.println("Try again");
//        else if(s == Status.Pending)
//            System.out.println("Please wait");
//        else
//            System.out.println("Done");
//    }
//}

        // enums with switch statement

//public class Enums
//{
//    public static void main(String[] args)
//    {
//        Status s = Status.Failed;
//
//        // a switch on an enum is not performed directly, it secretly creates a helper class(Enums$1.class here) that converts into an easy understandable bytecode for the JVM
//
//        switch(s)
//        {
//            case Running:
//                System.out.println("All Good");
//                break;
//            case Failed:
//                System.out.println("Try Again");
//                break;
//            case Pending:
//                System.out.println("Please Wait");
//                break;
//            case Success:
//                System.out.println("Done");
//                break;
//            default:
//                System.out.println("Invalid Status");
//                break;
//        }
//    }
//}
