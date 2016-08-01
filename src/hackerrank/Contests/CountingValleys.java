package hackerrank.Contests;

import java.util.Scanner;

/**
 * @author staher
 */
public class CountingValleys {

    public static void main(String[] args) {

        int level = 0; int valleyCount = 0;
        Scanner input = new Scanner(System.in);
        int steps = Integer.parseInt(input.nextLine());
        char[] stepSequence = input.nextLine().toCharArray();
        for(char i:stepSequence) {
            if(i == 'U')
                level++;
            else if(i == 'D') {
                if(level == 0)
                    valleyCount++;
                level--;
            }
        }
        if(level>=0)
            System.out.println(valleyCount);
        else
            System.out.println(valleyCount-1);
    }
}
