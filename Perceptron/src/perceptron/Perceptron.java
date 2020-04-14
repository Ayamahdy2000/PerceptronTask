package perceptron;

import java.util.*;

public class Perceptron {

    public static void main(String[] args) {
        int iuputNumber, rowNumber, colNumber;
        Scanner in = null;
        in = new Scanner(System.in);
        System.out.println("Enter the number of the input :");
        iuputNumber = in.nextInt();
        System.out.println("Enter the number of rows of the matrix:");
        rowNumber = in.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        colNumber = in.nextInt();
        int P[][] = new int[rowNumber][colNumber * iuputNumber];

        System.out.println("Enter the elements of the matrix");
        for (int x = 0; x < colNumber * iuputNumber; x++) {
            for (int j = 0; j < rowNumber; j++) {
                P[j][x] = in.nextInt();
            }
        }

        for (int j = 0; j < rowNumber; j++) {
            for (int x = 0; x < colNumber * iuputNumber; x++) {
                System.out.print(P[j][x] + "  ");

            }
            System.out.println("");
        }
        int rowTarget, colTarget;

        in = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        rowNumber = in.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        colNumber = in.nextInt();
        int T[][] = new int[rowNumber][colNumber * iuputNumber];

        System.out.println("Enter the elements of the matrix");
        for (int x = 0; x < colNumber * iuputNumber; x++) {
            for (int j = 0; j < rowNumber; j++) {
                T[j][x] = in.nextInt();
            }
        }

        for (int j = 0; j < rowNumber; j++) {
            for (int x = 0; x < colNumber * iuputNumber; x++) {
                System.out.print(T[j][x] + "  ");

            }
            System.out.println("");
        }
    }
}
