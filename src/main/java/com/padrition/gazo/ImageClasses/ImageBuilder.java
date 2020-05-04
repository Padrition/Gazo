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

    public void generateImageWithRandomColors()throws IOException{
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        for(int y = 0; y <= height; y += 5){
            int c = 0;
            for(int x = 0; x <=width; x += 5){
                g2d.setColor(getRandomColor());
                g2d.fillRect(x, y, x + 5, y + 5);
            }
            c += 10;
        }
        g2d.dispose();

        File file = new File("myimage.png");
        ImageIO.write(bufferedImage, "png" , file);
    }
    
    private Color getRandomColor(){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B = (int)(Math.random()*256);
        Color color = new Color(R , G , B);
        return color;
    }

}