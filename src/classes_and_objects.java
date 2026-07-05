
class Calculator
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

public class classes_and_objects
{
    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 4;

//        int result = num1 + num2;

//        System.out.println(result);

        Calculator calc = new Calculator(); // forms a new object of type calculator

        // calc is the reference

        int result = calc.add(num1, num2); // calling the add method using the reference

        System.out.println(result);

    }
}
