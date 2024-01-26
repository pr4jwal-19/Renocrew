package com.prajwal.week2.task9;

import java.util.Random;
import java.util.Scanner;

class Game{
    Scanner inp = new Scanner(System.in);
    Random random = new Random();
    private final int botNumber;
    private int noOfGuesses = 0;

    public Game(){
        botNumber = random.nextInt(101);
    }
    public int getUserInput(){
        System.out.println("Enter your guess between 1-100: ");
        return inp.nextInt();
    }
    public boolean isNumberCorrect(int userGuess){
        boolean isCorrect = false;
        if (userGuess>0 && userGuess<=100){
            setNoOfGuesses();
            if (userGuess==botNumber){
                System.out.println("You guessed it correct ! The number was "+botNumber);
                isCorrect = true;
            } else if (userGuess>botNumber) {
                System.out.println("Too Higher ! Guess a lower number.");
            } else {
                System.out.println("Too Lower ! Guess a higher number.");
            }
        }
        return isCorrect;
    }
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses() {
        noOfGuesses++;
    }
}
public class NumbersGame{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Game game = new Game();
        System.out.println("Write \"Enter\" to play the Number Guessing Game !");
        String ans = inp.nextLine();
        boolean playGame;
        playGame = ans.equals("Enter");
        while (playGame){
            int userGuess = game.getUserInput();
            if (game.isNumberCorrect(userGuess)){
                System.out.println("You guessed it Correctly in "
                        +game.getNoOfGuesses()+" Guesses !");
                playGame = false;
                break;
            }
        }
    }
}

