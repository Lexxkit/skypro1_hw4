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



    }
}
