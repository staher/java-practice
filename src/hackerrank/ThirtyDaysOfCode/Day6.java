package hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * Strings and char arrays + more loops.
 * @author staher
 */
public class Day6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        for (int i = 0; i < num; i++) {
            char[] input = in.nextLine().toCharArray();
            for(int j = 0; j < input.length; j+=2) {
                System.out.print(input[j]);
            }
            System.out.print(" ");
            for(int j = 1; j < input.length; j+=2) {
                System.out.print(input[j]);
            }
            System.out.println();
        }
        in.close();
    }
}
