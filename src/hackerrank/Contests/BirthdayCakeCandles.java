package hackerrank.Contests;

import java.util.Scanner;

/**
 * @author staher
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        int max = 0; int count = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int i=0; i < n; i++) {
            height[i] = in.nextInt();
            if(height[i] > max) {
                max = height[i];
                count = 1;
            }
            else if(height[i] == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
