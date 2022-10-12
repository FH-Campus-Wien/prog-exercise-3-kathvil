package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void oneMonthCalendar(int days, int startDay) {
        for (int i = - (startDay - 2); i <= days ; i++ ) {
            if (i < 1) {
                System.out.print("   ");
                continue;
            }

            if (i < 10) {
                System.out.print(" " + i + " ");
            } else {
                System.out.print(i + " ");
            }

            if ((i + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static long[] lcg(long seed) {
        long[] arr = new long[10];

        long m = (long) Math.pow(2, 31);
        int a = 1103515245;
        short c = 12345;
        long x = seed;

        for (int idx = 0; idx < arr.length; idx++) {
            x = (a * x + c) % m;
            arr[idx] = x;
        }

        return arr;
    }

    public static void guessingGame(int numberToGuess)
    {
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        int input = 0;

        while (numberToGuess != input && counter != 10) {
            input = scan.nextInt();

            if (input > numberToGuess) {
                System.out.print("Guess number " + counter + ": The number AI picked is lower than your guess." + System.lineSeparator());
            } else if (input < numberToGuess) {
                System.out.print("Guess number " + counter + ": The number AI picked is higher than your guess." + System.lineSeparator());
            }
            counter++;
        }

        if (input == numberToGuess) {
            System.out.println("Guess number " + (counter - 1)  + ": You won wisenheimer!");
        } else {
            System.out.print("Guess number " + counter + ": You lost! Have you ever heard of divide & conquer?" + System.lineSeparator());
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

        // Aufgabe 1 Calendar
        App.oneMonthCalendar(31,3);

        // Aufgabe 2

        // Aufgabe 3 Random Numbers
        int randomNumber = App.randomNumberBetweenOneAndHundred();
        App.guessingGame(randomNumber);

        //
    }
}