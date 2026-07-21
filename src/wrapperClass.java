public class wrapperClass
{
    public static void main(String[] args)
    {
        int num = 7;    // primitive variable
        Integer num1 = new  Integer(8);     // reference variable

        System.out.println(num1);

        Integer num2 = new Integer(num); // boxing (storing primitive value in wrapper object)
        Integer num3 = num;     // autoboxing (automatically assigning primitive value to wrapper object)

        System.out.println(num3);

        int num4 = num3.intValue();     // unboxing (getting value from a object type to primitive type)
        int num5 = num3;    // auto-unboxing (automatically converting object type to primitive type)

        System.out.println(num5);

        String str = "12";
        int n = Integer.parseInt(str);

        System.out.println(n);
    }
}
