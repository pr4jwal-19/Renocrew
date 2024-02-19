package com.prajwal.week4.practice17.task17;

public class User {
    private int userID;
    private String userName;
    private String userEmail;

    public User(int userID, String userName, String userEmail) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User [ " +
                "userID = " + userID +
                ", userName = '" + userName + '\'' +
                ", userEmail = '" + userEmail + '\'' +
                ']';
    }
}
