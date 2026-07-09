//
//class Calculator
//{
//    public int add(int n1, int n2)
//    {
//        int r = n1 + n2;
//        return r;
//    }
//}
//
//public class classes_and_objects
//{
//    public static void main(String args[])
//    {
//        int num1 = 5;
//        int num2 = 4;
//
// //        int result = num1 + num2;
//
// //        System.out.println(result);
//
//        Calculator calc = new Calculator(); // forms a new object of type calculator
//
//        // calc is the reference
//
//        int result = calc.add(num1, num2); // calling the add method using the reference
//
//        System.out.println(result);
//
//    }
//}



            // Methods


//class Computer
//{
//    public void playMusic()
//    {
//        System.out.println("Music Playing..");
//    }
//
//    public String getPen(int cost)
//    {
//        if(cost >= 10)
//        {
//            return "Pen";
//        }
//
//        return "Nothing";
//    }
//}
//
//public class classes_and_objects
//{
//    public static void main(String args[])
//    {
//
//        Computer comp = new Computer();
//
//        comp.playMusic();
//
//        String str = comp.getPen(15);
//
//        System.out.println(str);
//
//    }
//}



        // Method overloading


class Calculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)      // same method name but differs in number of parameters
    {
        return n1 + n2 + n3;
    }

    public double add(double num1, int num2)       // differs in return type
    {
        return num1 + num2;
    }
}

public class classes_and_objects
{
    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 4;
        int num3 = 7;

        double num4 = 5.34;

        Calculator calc = new Calculator();

        System.out.println(calc.add(num1, num2));

        System.out.println(calc.add(num1, num2, num3));

        System.out.println(calc.add(num4, num2));

    }
}