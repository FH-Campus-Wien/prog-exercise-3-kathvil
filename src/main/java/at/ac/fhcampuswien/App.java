package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App
{

    // Implement all methods as public static

    public static void oneMonthCalendar(int days, int startDay)
    {
        for (int i = -(startDay - 2); i <= days; i++)
        {
            if (i < 1)
            {
                System.out.print("   ");
                continue;
            }

            if (i < 10)
            {
                System.out.print(" " + i + " ");
            }
            else
            {
                System.out.print(i + " ");
            }

            if ((i + startDay - 1) % 7 == 0 || i == days)
            {
                System.out.println();
            }
        }
    }

    public static long[] lcg(long seed)
    {
        long[] arr = new long[10];

        long m = (long) Math.pow(2, 31);
        int a = 1103515245;
        short c = 12345;
        long x = seed;

        for (int idx = 0; idx < arr.length; idx++)
        {
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

        while (numberToGuess != input && counter != 10)
        {
            input = scan.nextInt();

            if (input > numberToGuess)
            {
                System.out.print("Guess number " + counter + ": The number AI picked is lower than your guess." + System.lineSeparator());
            }
            else if (input < numberToGuess)
            {
                System.out.print("Guess number " + counter + ": The number AI picked is higher than your guess." + System.lineSeparator());
            }
            counter++;
        }

        if (input == numberToGuess)
        {
            System.out.println("Guess number " + (counter - 1) + ": You won wisenheimer!");
        }
        else
        {
            System.out.print("Guess number " + counter + ": You lost! Have you ever heard of divide & conquer?" + System.lineSeparator());
        }
    }

    public static int randomNumberBetweenOneAndHundred()
    {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static boolean swapArrays(int[] arr1, int[] arr2)
    {
        if (arr1.length != arr2.length)
        {
            return false;
        }

        for (int idx = 0; idx < arr1.length; idx++)
        {
            int value = arr1[idx];
            arr1[idx] = arr2[idx];
            arr2[idx] = value;
        }

        return true;
    }

    public static String camelCase(String sentence)
    {
        char[] charArr = sentence.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < charArr.length; index++)
        {
            if (index == 0)
            {
                if (charArr[index] > 96 && charArr[index] < 123)
                {
                    result.append((char) (charArr[index] - 32));
                }
                else
                {
                    result.append(charArr[index]);
                }
                continue;
            }

            if (charArr[index] < 65)
            {
                continue;
            }

            // 32 is space
            if (charArr[index - 1] == 32)
            {
                if (charArr[index] > 96 && charArr[index] < 123)
                {
                    result.append((char) (charArr[index] - 32));
                }
                else
                {
                    result.append(charArr[index]);
                }

            }
            else
            {
                if (charArr[index] > 64 && charArr[index] < 91)
                {
                    result.append((char) (charArr[index] + 32));
                }
                else
                {
                    result.append(charArr[index]);
                }
            }
        }

        return result.toString();
    }

    public static int checkDigit(int[] digits)
    {
        int sum = 0;

        for (int index = 0; index < digits.length; index++)
        {
            sum += (index + 2) * digits[index];
        }

        int rest = sum % 11;

        switch (11 - rest)
        {
            case 11:
                return 5;
            case 10:
                return 0;
            default:
                return 11 - rest;
        }
    }
}
