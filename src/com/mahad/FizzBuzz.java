package com.mahad;

import java.util.Scanner;

/**
 * This program implements the FizzBuzz game.
 * 
 * The user inputs an upper limit, and the program prints numbers from 1 to that limit.
 * For multiples of 3, it prints "Fizz" instead of the number, and for multiples of 5,
 * it prints "Buzz". For numbers which are multiples of both 3 and 5, it prints "FizzBuzz".
 * 
 * @version 1.0
 * @since 02/12/2024
 * @author Mahad
 */
public class FizzBuzz {

    /**
     * Main method that drives the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the upper limit for the FizzBuzz game
        System.out.println("Enter your last number: ");
        int upperLimit = input.nextInt();

        // Call the fizzBuzz method to start the game
        fizzBuzz(1, upperLimit);

        // Close the scanner to prevent resource leak
        input.close();
    }

    /**
     * Method that performs the FizzBuzz logic.
     * 
     * @param start The starting number for the FizzBuzz game.
     * @param end The ending number for the FizzBuzz game.
     */
    public static void fizzBuzz(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
