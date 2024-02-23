package com.prajwal.week5.friday;

import com.prajwal.week5.ConnectionProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem3 {
    public static void main(String[] args) {
        try {

            String username = "root";
            String password = "lkjhgfdsa";

            Connection con = ConnectionProvider.getConnection(username,password);

            String query = "SELECT * FROM student";

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()){
                int S_Id = rs.getInt("S_ID");
                String fName = rs.getString("First_Name");
                String lName = rs.getString("Last_Name");
                int ranting = rs.getInt("Rating");

                System.out.println("S-ID: "+S_Id+"\t|| Name: "+fName+" "+lName+"\t|| Rating: "+ranting);
            }

            con.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
