public class conditional_statements {

    public static void main(String args[]){

        // if condition

        int x = 5;

        if(x < 10){
            System.out.println("Condition is true");
        }

        // if-else statements

        int a = 3;
        int b = 7;

        if(a > b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }

        // if - else if- else statements

        int num1 = 5;
        int num2 = 7;
        int num3 = 9;

        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is greatest among 3");
        }
        else if(num2 > num3){
            System.out.println("num2 is greatest among 3");
        }
        else{
            System.out.println("num3 is greatest among 3");
        }

    }
}
