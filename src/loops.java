public class loops {
    public static void main(String args[]){

        // while loop

//        int i = 1;
//
//        while(i <= 4)
//        {
//            System.out.println("Hi " + i);
//            i++;
//        }
//
//        System.out.println("Bye " + i);


//        // nested while loop
//
//        int i = 1;
//
//        while(i <= 4)   // will execute the block of code until the condition becomes false
//        {
//            System.out.println("Hi " + i);
//
//            int j = 1;
//                            // for each time the upper condition is true, it will again make a variable j and reassign the value to it and will execute the below block till the condition is true
//            while(j <= 3)
//            {
//                System.out.println("Hello " + j);
//                j++;
//            }
//
//            i++;
//        }
//
//        System.out.println("Bye " + i);


        // do-while loop

        int i = 5;

        do  // will execute the block atleast once, (first executes the block of code, then checks the condition)
        {

            System.out.println("Hi " + i); // will print "5" and then increment i and then will check the condition
            i++;

        } while(i <= 4);

    }
}
