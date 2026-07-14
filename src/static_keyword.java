class Mobile
{
    String brand;
    int price;
    static String name;

    static
    {
        name = "phone";
        //System.out.println("in static");
    }
    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

//    public static void show1()
//    {
//        System.out.println(brand + " : " +  price + " : " + name);    // can not call non static variables in static method
//    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " +  obj.price + " : " + name);    // can not call non static variables in static method
    }
}

public class static_keyword
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smartphone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        //obj1.show1(); // we can call static method via objects but the method should only use static variables
        Mobile.show1(obj1);
    }
}

//public class static_keyword
//{
//    public static void main(String args[]) throws ClassNotFoundException
//    {
//        Class.forName("Mobile"); // loads the class
//    }
//}
