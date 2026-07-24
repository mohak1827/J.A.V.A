package enums;

enum Laptop
{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);  // all these are objects of Laptop
    // will call constructor 4 times(3 times parameterized, 1 time default)
    private int price;

    // constructors are always made private for enums because we're creating object in the same class itself

    private Laptop()
    {
        price = 500;
    }

    private Laptop(int price)
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class enumConstructor
{
    public static void main(String[] args)
    {
//        Laptop lap = Laptop.Macbook;
//        System.out.println(lap);    // prints Macbook

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }

    }
}
