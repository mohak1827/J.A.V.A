//public class conditional_statements {
//
//    public static void main(String args[]){
//
//        // if condition
//
//        int x = 5;
//
//        if(x < 10){
//            System.out.println("Condition is true");
//        }
//
//        // if-else statements
//
//        int a = 3;
//        int b = 7;
//
//        if(a > b){
//            System.out.println("a is greater");
//        }else{
//            System.out.println("b is greater");
//        }
//
//        // if - else if- else statements
//
//        int num1 = 5;
//        int num2 = 7;
//        int num3 = 9;
//
//        if(num1 > num2 && num1 > num3){
//            System.out.println("num1 is greatest among 3");
//        }
//        else if(num2 > num3){
//            System.out.println("num2 is greatest among 3");
//        }
//        else{
//            System.out.println("num3 is greatest among 3");
//        }
//
//    }
//}




// ternary operator

//public class conditional_statements {
//
//    public static void main(String args[]){
//
//        int num = 4;
//
//        boolean eve = num%2 == 0 ? true : false;
//
//        if(eve){
//            System.out.println("It is an even number");
//        }
//        else{
//            System.out.println("It is an odd number");
//        }
//
//        // nested ternary
//
//        int marks = 77;
//
//        String grade =
//                (marks > 80) ? "O" :
//                (marks > 70) ? "A+" :
//                (marks > 60) ? "A" :
//                (marks > 50) ? "B+" :
//                (marks > 40) ? "P" : "F";
//
//        System.out.println(grade);
//    }
//}




// switch statements

public class conditional_statements {

    public static void main(String args[]){

        int day = 7;

        switch(day){
            case 1 :
                System.out.println("Monday");
                break; // necessary because if switch found a match then it will not check further cases to be matched it will execute all of them without checking
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Enter a valid number");
        }
    }
}