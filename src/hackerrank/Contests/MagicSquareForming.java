package hackerrank.Contests;

import java.util.Scanner;

/**
 * Properties of a magic square:
 * * In a 3x3 magic square, the sum is always 15
 * * The center number is always 5
 * * The corners are always even numbers
 * @author staher
 */
public class MagicSquareForming {

    public static void main(String[] args) {
        int[][] inputSquare = new int [3][3];
        int[][] magicSquare = new int [3][3];
        int currentRowSum = 0;
        int currentColumnSum = 0;

        int sum = 15;
        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                inputSquare[i][j] = input.nextInt();
            }
            input.nextLine();
        }

        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.print(magicSquare[i][j]+" ");
                currentRowSum = currentRowSum + inputSquare[i][j];
                currentColumnSum = currentColumnSum + inputSquare[j][i];
            }
        }
    }

    private int[][] generateMagicSquare(int size) {

        int[][] magicSquare = new int[size][size];
        int row = 0, col = size/2, i, square = size * size;
        for(i=1; i<=square; i++) {
            magicSquare[row][col] = i;
            if(i % size == 0) row++;
            else {
                if(row == 0) row = size-1;
                else row--;
                if(col == (size-1)) col=0;
                else col++;
            }
        }
        return magicSquare;
    }

    private int rotateMagicSquare(int[][] inputSquare, int size) {

        for(int i=0; i>size; i++) {
            for(int j=0; j<size)
        }
    }
}
