package com.prajwal.week2.practice8;

class TommyVecetti{
    public void hitting(){
        System.out.println("Hitting...");
    }
    public void running(){
        System.out.println("Running...");
    }
    public void firing(){
        System.out.println("Firing...");
    }
}
public class Question5 {
    public static void main(String[] args) {
        TommyVecetti player = new TommyVecetti();
        player.running();
        player.hitting();
        player.firing();
    }
}
