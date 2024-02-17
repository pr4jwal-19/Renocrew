package com.prajwal.week4.practice17.task17;

public interface Users {

    //this generates a userID
    int registerUsers(String userName, String userEmail);
    boolean login(int userID,String userName);
    void displayUserDetails();
    void displayIssuedHistory(int userID, String userName);
    void changeUserName(String oldUserName,String newUserName);
    void changeUserEmail(String oldUserEmail,String newUserEmail);
}
