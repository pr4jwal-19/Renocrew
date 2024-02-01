package com.prajwal.week3.practice12;

interface SmartTVRemote extends TVRemote{
    void netflixButton();
    void amazonPrimeButton();
}
interface TVRemote{
    void turnOnButton();
    void turnOffButton();
}
class TV implements TVRemote{
    @Override
    public void turnOnButton() {
        System.out.println("Turns ON the TV");
    }
    @Override
    public void turnOffButton() {
        System.out.println("Turns OFF the TV");
    }
}
public class Problem6_7 {
    public static void main(String[] args) {
        TV television = new TV();
        television.turnOnButton();
        television.turnOffButton();
        TVRemote tvRemote = new TV();
        tvRemote.turnOnButton();
        tvRemote.turnOffButton();
    }
}
