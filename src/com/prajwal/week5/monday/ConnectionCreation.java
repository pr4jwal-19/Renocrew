package com.prajwal.week5.monday;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCreation {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create a connection
            String url = "jdbc:mysql://localhost:3306/Renocrew";
            String username = "root";
            String password = "lkjhgfdsa";

            Connection con = DriverManager.getConnection(url,username,password);

            if (con.isClosed()){
                System.out.println("Connection is Closed !");
            } else {
                System.out.println("Connection is created !");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

