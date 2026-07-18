// every class is inherited from object class
// object class itself have some methdods, we can override them according to our requirements

class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return "Model " + model + " : " + price;
    }
}
public class ObjectClass
{
    public static void main(String[] args)
    {
        Laptop obj = new Laptop();
        obj.model = "HP Pavillion";
        obj.price = 75000;

        System.out.println(obj);    // it calls obj.toString() method by default, System.out.println(obj.toString());
        // gives class name with hashcode


        System.out.println(obj.toString());     // overridden
    }
}
