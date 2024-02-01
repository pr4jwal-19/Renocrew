package com.prajwal.week3.practice12;

interface Camera{
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
interface Wifi{
    String[] networks = {"LANnister","DaPrajwalWifi","ChickenWing","RenocrewSoln"};
    String[] getNetworks();
    void connectToNetwork(String ntwID);
}
class CellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling...."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class SmartPhone extends MyCellPhone implements MyCamera, MyWifi {
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
public class DefaultMethods {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        String[] networks = smartPhone.getNetworks();
        for (String ntw:networks){
            System.out.println(ntw);
        }
        smartPhone.connectToNetwork("LANnister");
        smartPhone.takeSnap();
        smartPhone.recordVideo();
        smartPhone.recordLive();
        smartPhone.callNumber(7720928263L);
        smartPhone.pickCall();
    }
}
