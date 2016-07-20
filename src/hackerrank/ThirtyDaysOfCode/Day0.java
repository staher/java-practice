package hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * 30 Days Of Code: Day 0
 * Simple program to read in a line from the the input stream using Scanner and output it.
 *
 * @author staher
 */

public class Day0 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();

        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
