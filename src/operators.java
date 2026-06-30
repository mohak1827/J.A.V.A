//public class operators {
//    public static void main(String args[]){
//
//        int num1 = 7; // assignment operator
//        int num2 = 5;
//
//        // arithmetic operators
//
//        int result = num1 + num2; // addition
//        System.out.println(result);
//
//        result = num1 - num2; // subtraction
//        System.out.println(result);
//
//        result = num1 * num2; // multiplication
//        System.out.println(result);
//
//        result = num1 / num2; // division
//        System.out.println(result);
//
//        result = num1 % num2; // modulus
//        System.out.println(result);
//
//        num1 = num1 + 2; // assignment operator we can also use num += 2
//        System.out.println(num1);
//
//        // num1 += 1;
//        num1 = 3;
//        int res = num1++; // post - increment, fetch the value first and then increment
//        System.out.println(res); // output : 3, num1 : 4
//        //num1--; // decrement
//
//        num1 = 3;
//        res = ++num1; // pre - increment, first increment and then fetch the value
//        System.out.println(res); // output : 4, num1 : 4
//
//    }
//}

//public class operators {
//    public static void main(String args[]){
//
//        // relational operators
//
//        int x = 6;
//        int y = 7;
//
//        boolean res = x < y; // checking if x is less than y
//        System.out.println(res);
//
//        res = x > y; // checking if x is greater than y
//        System.out.println(res);
//
//        res = x >= y; // checks if x is greater than or equal to y
//        System.out.println(res);
//
//        res = x <= y; // checks if x is less than or equal to y
//        System.out.println(res);
//
//        res = x == y; // checking if both the values are equal
//        System.out.println(res);
//
//        res = x != y; // returns true if the values are not equal
//        System.out.println(res);
//
//    }
//}


public class operators {
    public static void main(String args[]){

        // logical operators, used to combine and compare more than one relational operator

        int x = 5;
        int y = 6;

        int a = 4;
        int b = 3;

        boolean res = (x > y) && (a > b); // checking if both the conditions are true
        System.out.println(res);

        res = (x > y) || (a > b); // checking if either or these statements if true
        System.out.println(res);

        boolean r = !res; // returns the opposite of res, returns true if false and vice - versa
        System.out.println(r);
    }
}