package hackerrank.Algorithms;

import java.util.Scanner;

/**
 * @author staher
 */
public class SimpleArraySum {

    public static void main(String[] args) {

        int sum = 0;
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        for (int i = 0; i < num; i++) {
            sum = sum + in.nextInt();
        }
        System.out.println(sum);
    }
}
