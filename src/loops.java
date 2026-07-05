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

        int i = 1;

        while(i <= 4)
        {
            System.out.println("Hi " + i);

            int j = 1;

            while(j <= 3)
            {
                System.out.println("Hello " + j);
                j++;
            }

            i++;
        }

        System.out.println("Bye " + i);

    }
}
