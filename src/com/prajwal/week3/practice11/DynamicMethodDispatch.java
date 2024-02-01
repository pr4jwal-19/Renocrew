package com.prajwal.week3.practice11;

class Phone {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showTime(){
        System.out.println("Hello, "+getName()+". It's 2:00 pm");
    }
    public void dialNumber(){
        System.out.println("Dialing....");
    }
}
class SmartPhone extends Phone {
    //overridden method from class One
    @Override
    public void showTime(){
        System.out.println("Hello, "+getName()+". It's 2:00:34 pm. Have a good day !");
    }
    public void playMusic(){
        System.out.println("Hello, "+getName()+". Playing Spotify....");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // yaha pe Phone class ka sabh cheez run hoga
        Phone obj1 = new Phone();
        obj1.setName("Prajwal");
        obj1.showTime();
        obj1.dialNumber();
        // dynamic method dispatch -> runtime polymorphism
        // reference hai Phone ka but obj ban raha hai SmartPhone ka
        // abhi isme ref hai Phone ka but obj ban raha hai SmartPhone ka
        // toh jo overridden method hai .showName() vo jiska obj bana hai
        // uska run honga
        Phone obj2 = new SmartPhone();
        obj2.setName("Tejas");
        // this will show the overridden method
        obj2.showTime();
        obj2.dialNumber();
        // left mai jo bhi hai uske reference ke sare methods
        // aur right mai jiska obj bana hai uske sare methods
        SmartPhone obj3 = new SmartPhone();
        obj3.setName("Aditya");
        obj3.showTime();
        obj3.playMusic();

    }
}
