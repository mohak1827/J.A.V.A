package Input;

import java.util.Scanner;

public class ScannerInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);    // scanner accepts from where we are taking the input

        // it was introduced in later versions and has a lot of methods that we can use
        int num = sc.nextInt();
        System.out.println(num);
    }
}
