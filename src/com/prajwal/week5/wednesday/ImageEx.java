package com.prajwal.week5.wednesday;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageEx {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create a connection
            String url = "jdbc:mysql://localhost:3306/Renocrew";
            String username = "root";
            String password = "lkjhgfdsa";

            Connection con = DriverManager.getConnection(url, username, password);

            // execute a query
            String query = "INSERT INTO Images(pic) VALUES(?)";

            PreparedStatement statement = con.prepareStatement(query);

            // "C:\Renocrew\src\com\prajwal\week5\jdbc-dB.jpg"
            FileInputStream image = new FileInputStream("C:/Renocrew/src/com/prajwal/week5/Batman.jpeg");

            statement.setBinaryStream(1,image,image.available());

            statement.executeUpdate();

            System.out.println("Image inserted !");

            con.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
