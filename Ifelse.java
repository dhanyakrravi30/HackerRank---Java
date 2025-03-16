/* Write a program that takes an integer N as input and follows these rules:

If N is odd, print "Weird".
If N is even and between 2 and 5 (inclusive), print "Not Weird".
If N is even and between 6 and 20 (inclusive), print "Weird".
If N is even and greater than 20, print "Not Weird".

*/

//OUTPUT
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Ifelse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else { 
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else { 
                System.out.println("Not Weird");
            }
        }
    }
}
