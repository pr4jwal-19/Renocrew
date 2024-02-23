package com.prajwal.week5.friday;

import com.prajwal.week5.ConnectionProvider;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Problem1 {
    // in this problem we have INSERTED images into the database "Renocrew"
    // we have also used Swing utilities -> for taking username,password of the dB (Renocrew) from the user
    // also the image.
    public static void main(String[] args) {
        // we are using this thread to avoid any input buffer time
        // it will run after all the pending AWT events have been processed
        SwingUtilities.invokeLater(() -> {
            try {
                // To create connection
                // We will take the username and password from the user
                String username = JOptionPane.showInputDialog("Enter the username of the dB:");
                String password = JOptionPane.showInputDialog("Enter the password for the dB:");

                // We got the connection here
                Connection con = ConnectionProvider.getConnection(username, password);

                String query = "INSERT INTO Images(pic) VALUES(?)";

                // Now we want to select the image from pc
                // To pass it in FileInputStream obj
                JFileChooser fileChooser = new JFileChooser();
                // this returns 0 if selected
                int returnVal = fileChooser.showOpenDialog(null);

                // if we select yes - it will return 0
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                    try (FileInputStream fileInputStream = new FileInputStream(file)) {
                        PreparedStatement pStatement = con.prepareStatement(query);
                        pStatement.setBinaryStream(1, fileInputStream, (int) file.length());
                        pStatement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Image Inserted Successfully !");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

