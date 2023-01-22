package PracticeAtHome;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        int[][] arr = {{1, 3, 5, 7, 9, 11, 13, 15, 17, 19},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}};

        int evenSum = 0;
        int oddSum = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum += arr[i][j];
                } else {
                    oddSum += arr[i][j];
                }
            }

        }
        System.out.println("Summary of even numbers " + evenSum);
        System.out.println("Summary of odd numbers " + oddSum);

    }

}



































