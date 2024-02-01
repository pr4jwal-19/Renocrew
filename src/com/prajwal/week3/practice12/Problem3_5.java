package com.prajwal.week3.practice12;

class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Biting....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello there, I am a Human !");
    }
    @Override
    public void eat() {
        System.out.println("Eats, Eats, Eats !");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeps, Sleeps, Sleeps !");
    }
}
public class Problem3_5 {
    public static void main(String[] args) {
        // Q3:
        Human prajwal = new Human();
        prajwal.eat();
        prajwal.sleep();
        prajwal.speak();
        // Q5:  demonstrate polymorphism
        Monkey monkey = new Human();
        monkey.bite();
        monkey.jump();
    }
}
