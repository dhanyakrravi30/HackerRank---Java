/*
 * Problem Statement:
Java's System.out.printf function allows us to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

Input Format:

Each line of input will contain a String followed by an integer.
Each String consists of at most 10 alphabetic characters.
Each integer will be in the inclusive range 0 to 999.

Output Format:

The output should contain two columns:
The first column consists of the String, which should be left-justified within 15 characters.
The second column consists of the integer, which should be exactly 3 digits long, using leading zeros if necessary.
Print a border line before and after the output as shown below.

Constraints:
You will read exactly 3 lines of input.

Sample Input:

java 100
cpp 65
python 50


Sample Output:
================================
java           100
cpp            065
python         050
================================

 * 
 */

 //OUTPUT

 import java.util.Scanner;

public class OutputFormat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}



