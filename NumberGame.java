package org.susi.CodSoftTask1;

import java.util.Scanner;

public class NumberGame {
		//Repeat steps 2 and 3 until the user guesses the correct number.
	public static void guessingNumberGame()
    {
        Scanner s = new Scanner(System.in);
        int number = 1 + (int)(100* Math.random());
        int value = 3;
        int i, guess;
 
        System.out.println("guess number between 1 to 100."+ "Guess the number within 5 trials.");
         for (i = 0; i < value; i++) {
            System.out.println("Enter the number:");
             guess = s.nextInt();
 
             if (number == guess) {
                System.out.println(" You guessed the number.");
                break;
            }
            else if (number > guess && i != value - 1) {
                System.out.println("greater than " + guess);
            }
            else if (number < guess && i != value - 1) {
                System.out.println("less than " + guess);
            }
        }
 
        if (i == value) {
            System.out.println("You have exhausted"+ " value trials.");
            System.out.println("The number was " + number);
        }
    }
 
    public static void main(String arg[])
    {
        guessingNumberGame();
    }
}		
	


