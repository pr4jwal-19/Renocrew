package com.prajwal.week3.practice12;


interface MyCamera {
    void takeSnap();
    void recordVideo();
    private void start(){
        System.out.println("Starting Camera....");
    }
    default void recordLive(){
        start();
        System.out.println("Recording Live in 4K");
    }
}
interface MyWifi {
    String[] networks = {"LANnister","DaPrajwalWifi","ChickenWing","RenocrewSoln"};
    String[] getNetworks();
    void connectToNetwork(String ntwID);
}
class MyCellPhone {
    void callNumber(long phoneNumber){
        System.out.println("Calling...."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
    @Override
    public void takeSnap() {
        System.out.println("Clicking Snap....");
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording Video....");
    }

    /*
    @Override
    public void recordLive() {
        System.out.println("Recording Live in 1080p....");
    }
     */
    @Override
    public String[] getNetworks() {
        System.out.println("Getting the list of Networks....");
        return MyWifi.networks;
    }

    @Override
    public void connectToNetwork(String ntw) {
        System.out.println("Connecting to...."+ntw);
    }
}

public class PolymorphismOfInterfaces {
    public static void main(String[] args) {
        // Interface -> MyCamera ka Reference bana ke
        // Class -> MySmartPhone ka object thama de raha hu
        // isse humko sirf MyCamera ke methods dikhenge MySmartPhone aur baki ke Interfaces ke nahi
        MyCamera myCamera = new MySmartPhone();
        myCamera.takeSnap();
        myCamera.recordVideo();
        myCamera.recordLive();
        // cannot use methods of MyWifi and MySmartPhone
        // it's a SmartPhone which can only be used a Camera
    }
}
