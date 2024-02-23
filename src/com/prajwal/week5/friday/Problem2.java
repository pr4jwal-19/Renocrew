package com.prajwal.week5.friday;

import com.prajwal.week5.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

// update the column contents of the table : student from dB: Renocrew
public class Problem2 {
    public static void main(String[] args) {
        try {

            Scanner inp = new Scanner(System.in);

            System.out.print("Enter the username for dB: ");
            String username = inp.nextLine();

            System.out.print("Enter the password for dB: ");
            String password = inp.nextLine();

            Connection con = ConnectionProvider.getConnection(username,password);

            String query = "UPDATE student SET First_Name = ? , Last_Name = ? , Rating = ? WHERE S_ID = ?";

            System.out.print("Update the First Name: ");
            String fName = inp.nextLine();
            System.out.print("Update the Last Name: ");
            String lName = inp.nextLine();
            System.out.print("Update Student Rating: ");
            int rating = Integer.parseInt(inp.nextLine());
            System.out.print("Enter the Student ID: ");
            int sID = Integer.parseInt(inp.nextLine());

            PreparedStatement statement = con.prepareStatement(query);

            statement.setString(1,fName);
            statement.setString(2,lName);
            statement.setInt(3,rating);
            statement.setInt(4,sID);

            statement.executeUpdate();

            System.out.println("Updated the provided data successfully !");

            inp.close();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
