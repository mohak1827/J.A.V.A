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


        // nested while loop
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
//
//        int i = 5;
//
//        do  // will execute the block atleast once, (first executes the block of code, then checks the condition)
//        {
//
//            System.out.println("Hi " + i); // will print "5" and then increment i and then will check the condition
//            i++;
//
//        } while(i <= 4);


        // for loop

        //  In while and do-while loop we are initializing the variable, incrementing, and checking the condition in three different lines, but in the for loop we can make it in one single line when we know the number of times we have to execute the block of code

//        for(int i = 1; i <= 4; i++)
//        {
//            System.out.println("Hi " + i);
//        }

//        int i = 1;
//
//        for(;i <= 4;) // we can also write a for loop like this, but the semicolons are necessary.
//        {
//            System.out.println("Hi " + i);
//            i++;
//        }

        // nested for loop

        for(int i = 1; i <= 4; i++)
        {
            System.out.println("Hi, i = " + i);

            for(int j = 1; j <=3; j++)
            {
                System.out.println("j = " + j);
                System.out.println("i + j = " + (i+j) + " ");
            }

            System.out.println();

        }
    }
}
