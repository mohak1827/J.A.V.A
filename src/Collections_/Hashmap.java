package Collections_;

import java.util.HashMap;
import java.util.Map;

public class Hashmap
{
    public static void main(String[] args)
    {
        // Map<key, value>
        Map<String, Integer> students = new HashMap<>();    // if we are working with multiple threads and want to use HashMap then it is preffered to use synchronize externally
        //Map<String, Integer> students = new HashTable<>();  // synchronized(thread-safe)
        students.put("Mohak", 97);
        students.put("Madhav", 95);
        students.put("Ravish", 98);
        students.put("Harshit", 73);

        students.put("Mohak", 99);  // changes the value for the key
        // values can be duplicate but key cannot be duplicate

        students.remove("Harshit");     // removes the key and value the key is pointing to

        System.out.println(students.get("Madhav")); // value for specific key

        System.out.println(students);

        System.out.println(students.keySet());  // will print all the keys
        System.out.println(students.values());  // will print all the values

        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
