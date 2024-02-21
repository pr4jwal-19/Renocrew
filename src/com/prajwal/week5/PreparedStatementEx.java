package com.prajwal.week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create a connection
            String url = "jdbc:mysql://localhost:3306/Renocrew";
            String username = "root";
            String password = "lkjhgfdsa";

            Connection con = DriverManager.getConnection(url, username, password);

            // CREATE A QUERY FOR INSERT
            String query = "INSERT INTO Student(First_Name,Last_Name,Rating) VALUES (?,?,?)";

            // GET THE PreparedStatement obj
            PreparedStatement statement = con.prepareStatement(query);

            System.out.println("\t\t\t\"Welcome to the dB of Renocrew\"");
            System.out.println("Provide the Student Information -> ");
            // SET THE VALUES TO QUERY
            Scanner inp = new Scanner(System.in);
            System.out.print("Enter the first-name: ");
            String fName = inp.nextLine();
            System.out.print("Enter the last-name: ");
            String lName = inp.nextLine();
            System.out.println("Enter the Ranking(1-5): ");
            int rank = inp.nextInt();
            statement.setString(1,fName);
            statement.setString(2,lName);
            statement.setInt(3,rank);

            // now no need to pass the query
            // we already set it using the setters of PreparedStatement
            statement.executeUpdate();

            System.out.println("Query inserted successfully");

            inp.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
