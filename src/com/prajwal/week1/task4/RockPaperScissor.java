package com.prajwal.week1.task4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter user_name: ");
        String uname= inp.nextLine();
        System.out.println("Welcome ! "+uname+", to play Rock ,Paper, Scissor");
        while (true) {
            System.out.println("Enter 1(Rock), 2(Paper), 3(Scissor) as your choice: ");
            int choice = inp.nextInt();
            if (choice<1 && choice>3){
                System.out.println("Enter valid choice !");
                continue;
            }
            Random rand = new Random();
            int compChoice = rand.nextInt(4);
            System.out.println("Computer chose "+compChoice);
            String result = checkWinner(choice,compChoice);
            System.out.println(result);

            System.out.println("Do you want to play again ? (y/n)\nEnter your choice (y/n): ");
            String playAgain = inp.next().toLowerCase();
            if (!playAgain.equals("y")){
                System.out.println("Thanks for playing !");
                break;
            }
        }
    }
    static String checkWinner(int userChoice,int compChoice){
        if (userChoice==compChoice){
            return "It's a Tie";
        } else if (userChoice==1 && compChoice==3 || userChoice==2 && compChoice==1 || userChoice==3 && compChoice==2) {
            return "You Win !";
        } else {
            return "You Lose ! \nComputer Wins";
        }
    }
}