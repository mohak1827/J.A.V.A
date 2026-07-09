//public class arrays
//{
//    public static void main(String args[])
//    {
////        int nums[] = {5,6,7};
////
////        for(int i = 0; i < nums.length; i++)
////        {
////            System.out.print(nums[i] + " ");
////        }
//
////        int nums[] = new int[4];  // ny default all the values will be set to 0
////
////        nums[0] = 3;
////        nums[1] = 2;
////        nums[2] = 7;
////        nums[3] = 4;
////
////        for(int num : nums)  // enhanced for loop (for each loop)
////        {
////            System.out.print(num + " ");
////        }
//
//
////        // multi-dimensional array
//
////        int nums[][] = new int[3][4];
////
////        for(int i = 0; i < 3; i++)
////        {
////            for(int j = 0; j < 4; j++)
////            {
////                nums[i][j] = (int) (Math.random() * 10); // assigning a random value
////            }
////        }
////
////        for(int num[] : nums)
////        {
////            for(int n : num)
////            {
////                System.out.print(n + " ");
////            }
////            System.out.println();
////        }
//
//
//        // jagged array (array of arrays of different size)
//
//        int nums[][] = new int[3][];
//
//        nums[0] = new int[2];
//        nums[1] = new int[4];
//        nums[2] = new int[3];
//
//        for(int i = 0; i < nums.length; i++)
//        {
//            for(int j = 0; j < nums[i].length; j++)
//            {
//                nums[i][j] = (int) (Math.random() * 10);
//            }
//        }
//
//        for(int n[] : nums)
//        {
//            for(int m : n)
//            {
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}



        // array of objects

class Student
{
    int roll;
    String name;
    int marks;
}
public class arrays
{
    public static void main(String args[])
    {

        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Mohak";
        s1.marks = 98;

        System.out.println(s1); // will print the memory adress of s1

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Madhav";
        s2.marks = 83;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Ravish";
        s3.marks = 97;

        Student students[] = new Student[3];  // creates an array of objects (doesn't means it is creating 3 objects, it can store references of 3 objects)

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }

    }
}
