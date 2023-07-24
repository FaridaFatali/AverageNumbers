package org.example;

import java.util.Scanner;

// Finding thw numbers divided by 4 and 5 at the same time and then their average

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int sumDividedByFourAndFive = 0;
        int dividedByFourAndFive = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);
                sumDividedByFourAndFive += i;
                dividedByFourAndFive++;
            }
        }

        double average = (double) sumDividedByFourAndFive / dividedByFourAndFive;

        System.out.println();
        System.out.println("The average of these numbers: " + average);

    }
}

