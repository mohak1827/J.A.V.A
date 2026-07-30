package Collections_;

import java.util.*;

public class Hashset
{
    public static void main(String[] args)
    {
        //Set<Integer> nums = new LinkedHashSet<>();  // remembers the order(maintains the sequence)
        Set<Integer> nums = new HashSet<>();
        // set only contains unique values
        //Set<Integer> nums = new TreeSet<>();    // sorted output

        nums.add(53);
        nums.add(12);
        nums.add(86);
        nums.add(63);
        nums.add(12);    // will not gonna be added into the set

        // set doesn't have any indexing
//        for(int n : nums)
//        {
//            System.out.println(n);  // it will neither follow the sequence nor the sorted format
//        }

        // we can also iterate through Iterator

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
        {
            System.out.println(values.next());
        }

    }
}
