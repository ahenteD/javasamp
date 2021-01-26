package com.nald.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessMe {
    public static void main (String[] args) {
        System.out.println("Welcome To Guess Number Game");
        System.out.println("May I have the first name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Shall we begin the game?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");
        int beginAnswer = scanner.nextInt();

        while (beginAnswer != 1) {
            System.out.println("Shall we start now?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            beginAnswer = scanner.nextInt();

        }
        Random random = new Random();
        int x = random.nextInt( 20) + 1;
        System.out.println("Please enter your guess");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hadWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            timesTried++;

            if (timesTried < 5) {
                if (userInput == x) {
                    hadWon = true;
                    shouldFinish = true;
                } else if (userInput > x) {
                    System.out.println("Guess Lower Number");
                    userInput = scanner.nextInt();
                } else {
                    System.out.println("Guess Higher Number");
                    userInput = scanner.nextInt();
                }
            } else {
                shouldFinish = true;
            }
        }
            if (hadWon) {
                System.out.print("Congratulation! You have guessed in your " + "number");
            } else {
                System.out.println("Game Over!");
                System.out.println("The number was: " + x);


            }
    }
}
