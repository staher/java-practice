package hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * Calculate total cost of a meal given tax and tip percentages.
 * @author staher
 */
public class Day2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tip = (mealCost*tipPercent)/100;
        double tax = (mealCost*taxPercent)/100;
        double calculatedTotalCost = mealCost + tip + tax;

        int totalCost = (int) Math.round(calculatedTotalCost);

        System.out.println("The total meal cost is "+ totalCost +" dollars.");
    }
}
