/* Write a Java program that reads the following inputs from the user:

An integer
A double
A string
Then, print the values in the following format:

Input Format:
The first line contains an integer.
The second line contains a double.
The third line contains a string.
Output Format:
Print the values in three lines as follows:

First line: String: followed by the string input.
Second line: Double: followed by the double input.
Third line: Int: followed by the integer input.

Example Input:

42
3.1415
Welcome to HackerRank's Java tutorials!

Example Output:

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

*/

//OUTPUT

import java.util.Scanner;

public class Sca {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble(); 
        scan.nextLine();  
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}