package hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * 30 Days Of Code: Day 1
 *
 * @author staher
 */

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        Scanner scan = new Scanner(System.in);

        int secondInt = Integer.parseInt(scan.nextLine());
        double secondDouble = Double.parseDouble(scan.nextLine());
        String secondString = scan.nextLine();

        System.out.println(i+secondInt);
        System.out.println(d+secondDouble);

        s = s.concat(secondString);
        System.out.println(s);

        scan.close();
    }
}
