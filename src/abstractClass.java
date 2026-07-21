abstract class Car      // abstract class can contain both abstract and normal methods
{
    // abstract method can only be defined in abstract class

    public abstract void drive();   // declaring the function
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Playing music...");
    }
}
abstract class Zen extends Car       // it is compulsory to define all the abstract methods of the super class or else you can make this class abstract too
{
    public void drive()     // implementing the abstract method
    {
        System.out.println("Driving..");
    }
}

class UpdatedZen extends Zen    // concrete class
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}

public class abstractClass
{
    public static void main(String[] args)
    {
        // Car obj = new Car();    // can not create object of abstract class
        // Car obj = new Zen();        // can't create object of this too now!
        Car obj = new UpdatedZen();     // can create an object of concrete class
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
