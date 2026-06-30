public class variables_dataTypes {
    public static void main(String[] args){

        // literals

        int num = 0b101; //assigning binary value to int
        System.out.println(num);
        int num2 = 0x7E; // hexadecimal number
        System.out.println(num2);
        int num3 = 1_00_00_000; // can use underscore to differentiate numbers for our understanding
        System.out.println(num3);

        double d = 56; // int automatically converts to double
        System.out.println(d);
        double d1 = 12e10;
        System.out.println(d1);

        char c = 'a';
        System.out.println(c);
        c++; // can perform incrementation or decrementation on character and it will work according to the ascii values
        System.out.println(c); // prints 'b'

        byte b1 = 127;
        int a = b1;
        System.out.println(a);

        int a1 = 12;
        //byte b2 = a1; //error
        byte b2 = (byte) a1; //typecasting
        System.out.println(b2);

        byte b = (byte)257; // out of range of byte, but can explicitly be converted, and it will modulo by the total number of values byte can have(-128 to 127 -> 256)
        System.out.println(b);

        float f = 5.6f;
        int t = (int) f; // will lose the value after the decimal
        System.out.println(t);

        byte val1 = 10;
        byte val2 = 30;
        int res = val1 * val2; // type promotion, as the multiplication value goes beyond the byte range(can be stored in any of higher range eg. int, float, double)
        System.out.println(res);

    }
}