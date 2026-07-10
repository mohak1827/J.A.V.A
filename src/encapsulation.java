
class Human
{
//    int age;
//    String name;

    private int age = 19;    // private keeps its access only within the class
    private String name = "Mohak";

    public int getAge()    // getter
    {
        return age;
    }

    public void setAge(int a)   // setter
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String str)
    {
        name = str;
    }
}

public class encapsulation
{
    public static void main(String args[])
    {
        Human obj = new Human();

//        obj.age = 19;    // can't access or initialize because it has been made private
//        obj.name = "Mohak";

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        obj.setAge(20);
        System.out.println(obj.getAge());

        obj.setName("Taneja");
        System.out.println(obj.getName());
    }
}
