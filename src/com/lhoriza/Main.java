package com.lhoriza;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int minimum = 1;
        int maximum = 100;
        Random random = new Random();
        int randomNumber = minimum + random.nextInt((maximum - minimum) + 1);

        int userGuessNumber;
        int attempt = 1;
        Scanner appScanner = new Scanner(System.in);
        System.out.println("Guess the number (between 1 and 100) in 3 attempts: ");
        userGuessNumber = appScanner.nextInt();

        for (int i = 1; i < 4; i++) {
            if (userGuessNumber == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempt + " guesses.");
                break;
            } else if (attempt < 3) {
                if (userGuessNumber < randomNumber) {
                    System.out.println("Too low. Guess again: ");
                    userGuessNumber = appScanner.nextInt();
                } else {
                    System.out.println("Too high. Guess again: ");
                    userGuessNumber = appScanner.nextInt();
                }
            } else {
                System.out.println("Sorry you did not guess the number in 3 guesses. The correct number is " + randomNumber + ".");
            }
            attempt++;
        }
    }
}
