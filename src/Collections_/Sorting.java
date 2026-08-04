package Collections_;

import java.util.*;

//public class Sorting
//{
//    public static void main(String[] args)
//    {
//        List<Integer> list = new ArrayList<>();
//        list.add(43);
//        list.add(32);
//        list.add(27);
//        list.add(64);
//
//        Collections.sort(list);     // sorting in ascending order
//
//        System.out.println(list);
//    }
//}



        // sorting with specified conditions (using comparator)


//public class Sorting
//{
//    public static void main(String[] args)
//    {
//        // using comparator to compare values

            // comparator is an interface having abstract method 'compare'

//        Comparator<Integer> com = new Comparator<Integer>()
//        {
                    // anonymous inner class
//            public int compare(Integer i, Integer j) {
//                if(i%10 > j%10)
//                    return 1;       // returns 1 if we want to swap
//                else
//                    return -1;
//            }
//        };
//        List<Integer> list = new ArrayList<>();
//        list.add(43);
//        list.add(32);
//        list.add(27);
//        list.add(64);
//
//        Collections.sort(list, com);     // sorting with respect to our specified conditions
//
//        System.out.println(list);
//    }
//}


        // sorting list of objects


//class Student
//{
//    int age;
//    String name;
//
//    public Student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
//public class Sorting
//{
//    public static void main(String[] args)
//    {
////        Comparator<Student> com = new Comparator<Student>()
////        {
////            public int compare(Student i, Student j) {
////                if(i.age > j.age)
////                    return 1;
////                else
////                    return -1;
////            }
////        };
//
//        Comparator<Student> com = (Student i, Student j) -> i.age > j.age ? 1 : -1;  // using lambda function
//
//        List<Student> studs = new ArrayList<>();
//        studs.add(new Student(19, "Mohak"));
//        studs.add(new Student(20, "Madhav"));
//        studs.add(new Student(17, "Jhalak"));
//        studs.add(new Student(2, "Vamika"));
//
//        Collections.sort(studs, com);
//
//        // Collections.sort(studs); // can't simply pass student object here, (Integer class implements comparable, that's why we were able to use it there)
//
//        for(Student s : studs)
//            System.out.println(s);
//    }
//}


        // sorting using comparable

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}
public class Sorting
{
    public static void main(String[] args)
    {

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(19, "Mohak"));
        studs.add(new Student(20, "Madhav"));
        studs.add(new Student(17, "Jhalak"));
        studs.add(new Student(2, "Vamika"));

        Collections.sort(studs);

        for(Student s : studs)
            System.out.println(s);
    }
}