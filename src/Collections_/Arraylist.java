package Collections_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylist
{
    public static void main(String[] args)
    {

        // ArrayList implements Collection interface

        //Collection nums = new ArrayList();  // one way but there's no specification about the type of values we can add up in it
        //nums.add(5);    // it is adding object values always

        //Collection<Integer> nums = new ArrayList<>();   // specified the type, but we can only perform a few operations as it is referring the collection interface
        //nums.add(5);

        List<Integer> nums = new ArrayList<>();     // referring the List interface and creating object of ArrayList
        nums.add(5);
        nums.add(7);
        nums.add(2);
        nums.add(9);
        nums.add(7);    // can contain duplicate values

        nums.get(0);    // fetching the value at a particular index

        System.out.println(nums);   // printing the list
    }
}
