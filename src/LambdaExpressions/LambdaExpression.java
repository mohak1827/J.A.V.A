package LambdaExpressions;

@FunctionalInterface    // annotation
interface A
{
    void show();
    //void config();  // gives error(functional interface must include only 1 method)
}

//class B implements A
//{
//    public void show()
//    {
//        System.out.println("in show");
//    }
//
//}

interface C
{
    void show(int i);
}

interface D
{
    int add(int i, int j);
}

public class LambdaExpression
{
    public static void main(String[] args)
    {
//        // creating object of B and calling the show method
//        A obj = new B();
//        obj.show();

//        // using anonymous inner class
//        A obj = new A()
//        {
//            public void show()
//            {
//                System.out.println("in show");
//            }
//        };

        // we can do this without doing any of these
        // by using lambda expression(can only be used with functional interfaces)

        // java says why should we type all the code that can be imagined or that is obvious while using functional interfaces, Java says all of this can be done by using '->'
        // syntactically reducing the code

//        A obj = () ->
//        {
//            System.out.println("in show");  // lambda expression
//        };
//        obj.show();

        // if we are having only one statement, we don't even need the curly braces

        A obj = () -> System.out.println("in show");
        obj.show();

        // lambda expression with parameters and arguments
        // C obj1 = (int i) -> System.out.println("in parameterized lambda expression " + i);

        // even we don't have to mention variable type, as it is already mentioned in the interface
        // C obj1 = (i) -> System.out.println("in parameterized lambda expression " + i);

        // if we have only one variable, we don't even need the round bracket
        C obj1 = i -> System.out.println("in parameterized lambda expression " + i);
        obj1.show(5);

        // behind the scenes it is working with the mechanism of anonymous inner class, but when we compile this code it doesn't create a class file for the anonymous inner class, so it reduced the number of files too, but yes the main class file(LambdaExpression.class here) will be little bit heavy there.

        // lambda expression with return type
//        D obj2 = (i,j) ->
//        {
//            return i+j;
//        };

        D obj2 = (i,j) ->  i+j;     // if the statement is an expression we don't have to type return, it automatically becomes return type/value
        int res = obj2.add(5,4);
        System.out.println(res);
    }
}
