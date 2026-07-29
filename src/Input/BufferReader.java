package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number");

        InputStreamReader in = new InputStreamReader(System.in);    // we have to pass inputStream object here

        BufferedReader bf = new BufferedReader(in); // to work with buffered reader we have to pass inputStreamReader object

        // might throw io exception
        int num = Integer.parseInt(bf.readLine());    // read line will give us string

        // BufferdReader can take input from anywhere, not just the system keyboard, it could be any file or anything
        bf.close();

        // BufferedReader is a resource which we are using to read, so it is recommended to close the resource
    }
}
