package com.lexxkit;

public class Main {

    public static void main(String[] args) {
	    // Task 1
        System.out.println("Task 1\n");

        int i = 1;
        while (i <= 10) {
            System.out.print(i);
            if (i < 10) {
                System.out.print(" ");
            } else {
                System.out.println();
                break;
            }
            i++;
        }

        for (; i > 0 ; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" ");
            }
        }

        // Task 2
        System.out.println("\n\nTask 2\n");

        int fridayDate = 5;

        for (; fridayDate <= 31 ; fridayDate += 7) {
            System.out.println("It's friday, the " + fridayDate + "th. You have to prepare the report.");
        }

        // Task 3
        System.out.println("\nTask 3\n");
        int PAST_PERIOD_OF_YEARS = 200;
        int YEARS_OF_FUTURE_PREDICTIONS = 100;

        int initialYear = 2022;

        for (int j = 0; j < initialYear + YEARS_OF_FUTURE_PREDICTIONS; j += 79) {
            if (j > initialYear - PAST_PERIOD_OF_YEARS) {
                System.out.println(j);
            }
        }

        // Task 4
        System.out.println("\nTask 4. Ping pong\n");

        for (int j = 1; j < 31; j++) {
            System.out.print(j + ":");
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.print(" ping pong\n");
                continue;
            } else if (j % 3 == 0) {
                System.out.print(" ping");
            } else if (j % 5 == 0) {
                System.out.print(" pong");
            }
            System.out.println();
        }

        // Task 5
        System.out.println("\nTask 5. Fibonacci\n");

        int[] fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int j = 2; j < fibonacci.length; j++) {
            fibonacci[j] = fibonacci[j-2] + fibonacci[j-1];
        }

        for (int j = 0; j < fibonacci.length; j++) {
            System.out.print(fibonacci[j] + " ");
        }
    }
}
