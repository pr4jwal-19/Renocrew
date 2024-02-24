package com.prajwal.week5.friday;

import com.prajwal.week5.ConnectionProvider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageDisplayer extends JFrame {

    private JPanel mainPanel;
    private JLabel initLabel;
    private JTextField txtID;
    private JButton getImgBtn;
    private JLabel imgDisplayer;

    public ImageDisplayer(){
        setContentPane(mainPanel);
        setTitle("Simple Image Displayer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,500);
        setLocationRelativeTo(null);
        setVisible(true);
        getImgBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = txtID.getText().trim();
                int id = Integer.parseInt(str);
                ImageIcon icon = ImageProvider.getImageById(id, ConnectionProvider.getConnection("root", "lkjhgfdsa"));
                if (icon == null) {
                    JOptionPane.showMessageDialog(null, "Incorrect ID passed.No Image found by that id: " + id);
                } else {
                    // Get the original image from the icon
                    Image image = icon.getImage();

                    // Calculate the available width and height
                    int maxWidth = imgDisplayer.getWidth() + 100;
                    int maxHeight = imgDisplayer.getHeight() + 100;

                    // Get the original width and height of the image
                    int originalWidth = icon.getIconWidth();
                    int originalHeight = icon.getIconHeight();

                    // Calculate the scaling factors for width and height
                    double widthScale = (double) maxWidth / originalWidth;
                    double heightScale = (double) maxHeight / originalHeight;

                    // Use the smaller of the two scaling factors to ensure the entire image fits within the bounds
                    double scale = Math.min(widthScale, heightScale);

                    // Calculate the scaled width and height
                    int scaledWidth = (int) (originalWidth * scale);
                    int scaledHeight = (int) (originalHeight * scale);

                    // Scale the image
                    Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

                    // Set the scaled image as icon
                    imgDisplayer.setIcon(new ImageIcon(scaledImage));
                }
                //imgDisplayer.setIcon(icon);
            }
        });

    }

    public static void main(String[] args) {
        new ImageDisplayer();
    }
}
