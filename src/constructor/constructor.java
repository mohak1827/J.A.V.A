package constructor;
class Human
{
    private int age;
    private String name;

    public Human()  // default constructor
    {
        age = 12;
        name = "John"; // assigning default values
    }

    public Human(int age, String name)    // parametrized constructor
    {
        this.age = age;
        this.name = name;
    }

    public Human(String name)
    {
        // age = 18;    // can assign default age in this too
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
}

public class constructor
{
    public static void main(String args[])
    {

        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());

        Human obj1 = new Human(19, "Mohak");
        System.out.println(obj1.getName() + " : " + obj1.getAge());

        Human obj2 = new Human("Madhav");    // default age would be 0
        System.out.println(obj2.getName() + " : " + obj2.getAge());

    }
}
