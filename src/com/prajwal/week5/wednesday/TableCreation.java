package com.prajwal.week5.wednesday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreation {
    // if you again run it -> it will give "table Student already exists error"
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create a connection
            String url = "jdbc:mysql://localhost:3306/Renocrew";
            String username = "root";
            String password = "lkjhgfdsa";

            Connection con = DriverManager.getConnection(url,username,password);

            // create a query
            String query = "CREATE TABLE Student (" +
                    "S_ID INT(4) UNSIGNED AUTO_INCREMENT PRIMARY KEY," +
                    "First_Name VARCHAR(30) NOT NULL," +
                    "Last_Name VARCHAR(30) NOT NULL," +
                    "Rating INT(5) UNSIGNED NOT NULL)";

            // CREATE A STATEMENT
            Statement statement = con.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table created !");

            // close the connection
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
