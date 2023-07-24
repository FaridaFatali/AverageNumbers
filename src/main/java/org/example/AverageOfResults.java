package org.example;

import java.util.Scanner;

/**
 * @author Farida Fatali
 */

// Finding the numbers divided by 2, 4 and 5. Then finding their average separately.

public class AverageOfResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.println("-----------------");
        int sumDividedByTwo = 0;
        int dividedByTwo = 0;
        System.out.println("The even numbers:");

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sumDividedByTwo += i;
                dividedByTwo++;
            }
        }

        System.out.println();
        double averageTwo = (double) sumDividedByTwo / dividedByTwo;
        System.out.println("The average of numbers divided by two: " + averageTwo);


        System.out.println("-----------------");
        System.out.println("The numbers divided by four: ");

        int sumDividedByFour = 0;
        int dividedByFour = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
                sumDividedByFour += i;
                dividedByFour++;
            }
        }

        System.out.println();
        double averageFour = (double) sumDividedByFour / dividedByFour;
        System.out.println("The average of numbers divided by four: " + averageFour);


        System.out.println("-----------------");
        System.out.println("The numbers divided by five: ");

        int sumDividedByFive = 0;
        int dividedByFive = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                sumDividedByFive += i;
                dividedByFive++;
            }
        }
        System.out.println();
        double averageFive = (double) sumDividedByFive / dividedByFive;
        System.out.println("The average of numbers divided by five: " + averageFive);
    }
}