package com.prajwal.week5.friday;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageProvider {
    public static ImageIcon getImageById(int id, Connection con){
        ImageIcon icon = null;

        try {

            String query = "SELECT pic FROM Images WHERE imgID = ?";

            PreparedStatement statement = con.prepareStatement(query);

            // sets the id we passed in the method in-place of ?
            statement.setInt(1,id);

            ResultSet rs = statement.executeQuery();

            if (rs.next()){
                // get the image and set it to a Blob variable
                Blob image = rs.getBlob("pic");
                InputStream inputStream = image.getBinaryStream();
                Image img = ImageIO.read(inputStream);
                icon = new ImageIcon(img);
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        return icon;
    }
}
