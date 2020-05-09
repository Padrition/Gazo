package com.padrition.gazo.ImageClasses;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageBuilder {

    private static final int width = 200;
    private static final int height = 200;

    public ImageBuilder(){}
    
    //set later to return the File
    public byte[] generateImageWithRandomColors()throws IOException{
        BufferedImage bufferedImage = new BufferedImage(width , height , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        for(int y = 0; y <= height; y += 5){
            for(int x = 0; x <=width; x += 5){
                g2d.setColor(getRandomColor());
                g2d.fillRect(x, y, x + 5, y + 5);
            }
        }
        g2d.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png" , baos);
        baos.flush();
        return baos.toByteArray();
    }
    
    public void generateImageWithRandomColors(int sizeOfBox)throws IOException{
        BufferedImage bufferedImage = new BufferedImage(width , height , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        for(int y = 0; y <= height; y += sizeOfBox){
            for(int x = 0; x <=width; x += sizeOfBox){
                g2d.setColor(getRandomColor());
                g2d.fillRect(x, y, x + sizeOfBox, y + sizeOfBox);
            }
        }
        g2d.dispose();

        File file = new File("FullyRandom.png");
        ImageIO.write(bufferedImage, "png" , file);
    }

    public void generateImageWithNumberOfColors(int numberOfColors)throws IOException{
        BufferedImage bufferedImage = new BufferedImage(width , height , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        Color[] colors = new Color[numberOfColors];
        for(int i = 0; i <= colors.length-1 ; i++){
            colors[i] = getRandomColor();
        }
        for(int y = 0; y <= height; y += 5){
            for(int x = 0; x <=width; x += 5){
                int i = (int)(Math.random()*colors.length);
                g2d.setColor(colors[i]);
                g2d.fillRect(x, y, x + 5, y + 5);
            }
        }
        g2d.dispose();

        File file = new File("WithSomeColors.png");
        ImageIO.write(bufferedImage, "png" , file);
    }

    public void generateImageWithNumberOfColors(int numberOfColors , int sizeOfBox)throws IOException{
        BufferedImage bufferedImage = new BufferedImage(width , height , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        Color[] colors = new Color[numberOfColors];
        for(int i = 0; i <= colors.length-1 ; i++){
            colors[i] = getRandomColor();
        }
        for(int y = 0; y <= height; y += sizeOfBox){
            for(int x = 0; x <=width; x += sizeOfBox){
                int i = (int)(Math.random()*colors.length);
                g2d.setColor(colors[i]);
                g2d.fillRect(x, y, x + sizeOfBox, y + sizeOfBox);
            }
        }
        g2d.dispose();

        File file = new File("WithSomeColors.png");
        ImageIO.write(bufferedImage, "png" , file);
    }

    public void generateImageWithCertainColors(Color...colors)throws IOException{
        BufferedImage bufferedImage = new BufferedImage(width , height , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        
        for(int y = 0; y <= height; y += 5){
            for(int x = 0; x <=width; x += 5){
                int i = (int)(Math.random()*colors.length);
                g2d.setColor(colors[i]);
                g2d.fillRect(x, y, x + 5, y + 5);
            }
        }
        g2d.dispose();

        File file = new File("WithCertainColors.png");
        ImageIO.write(bufferedImage, "png" , file);
    }

    public void generateImageWithCertainColors(int sizeOfBox , Color...colors)throws IOException{
        BufferedImage bufferedImage = new BufferedImage(width , height , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        
        for(int y = 0; y <= height; y += sizeOfBox){
            for(int x = 0; x <=width; x += sizeOfBox){
                int i = (int)(Math.random()*colors.length);
                g2d.setColor(colors[i]);
                g2d.fillRect(x, y, x + sizeOfBox, y + sizeOfBox);
            }
        }
        g2d.dispose();

        File file = new File("WithCertainColors.png");
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