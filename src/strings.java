public class strings
{
    public static void main(String args[])
    {
        // String name = "Mohak"; // String is a class, so we have to initialize with the new keyword to create an string object, although it will also work, we can declare and create a string variable without new keyword, difference is it will store the string variable in string pool and the one created using new keyword will store string in heap memory

        String name = new String("Mohak");

        System.out.println("Hello " + name);

        System.out.println(name.charAt(0)); // prints the character value at index 0

        System.out.println(name.concat(" Taneja")); // concats the two strings


        StringBuffer sb = new StringBuffer("Mohak");

        sb.append(" Taneja");

        sb.delete(5,sb.length());

        System.out.println(sb);

    }
}
