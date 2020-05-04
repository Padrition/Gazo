package com.padrition.gazo.ImageClasses;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageBuilder {

    private static final int width = 200;
    private static final int height = 200;

    BufferedImage bufferedImage = new BufferedImage(width , height , BufferedImage.TYPE_INT_RGB);

    Graphics2D g2d = bufferedImage.createGraphics();

    public ImageBuilder(){}

    public void createImage()throws IOException{
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        g2d.setColor(Color.RED);
        g2d.fillOval(0, 0, width, height);

        g2d.dispose();

        File file = new File("myimage.png");
        ImageIO.write(bufferedImage, "png" , file);

        file = new File("myimage2.jpg");
        ImageIO.write(bufferedImage, "jpg", file);
    }
    

}