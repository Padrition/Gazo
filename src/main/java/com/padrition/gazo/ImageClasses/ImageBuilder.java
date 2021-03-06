package com.padrition.gazo.ImageClasses;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;

@Component
public class ImageBuilder {

    private static final int width = 200;
    private static final int height = 200;

    public ImageBuilder(){}
    
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
    
    public byte[] generateImageWithRandomColors(int sizeOfBox)throws IOException{
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

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png" , baos);
        baos.flush();
        return baos.toByteArray();
    }

    public byte[] generateImageWithNumberOfColors(int numberOfColors)throws IOException{
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

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png" , baos);
        baos.flush();
        return baos.toByteArray();
    }

    public byte[] generateImageWithNumberOfColors(int numberOfColors , int sizeOfBox)throws IOException{
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

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png" , baos);
        baos.flush();
        return baos.toByteArray();
    }

    public byte[] generateImageWithCertainColors(Color...colors)throws IOException{
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

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png" , baos);
        baos.flush();
        return baos.toByteArray();
    }

    public byte[] generateImageWithCertainColors(int sizeOfBox , Color...colors)throws IOException{
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

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png" , baos);
        baos.flush();
        return baos.toByteArray();
    }

    public Color[] obtainColorsFromString(String stringOfColors){
            String[] colorsArray = stringOfColors.split(",");
            Color[] colors = new Color[colorsArray.length];
            for(int i = 0;i < colors.length;i++){
                int[] RGB = new int[3];
                String[] stringRGB = colorsArray[i].split("_");
                for(int j = 0; j < RGB.length;j++){
                    RGB[j] = Integer.parseInt(stringRGB[j]);
                }
                colors[i] = new Color(RGB[0],RGB[1],RGB[2]);
            }
        return colors;
    }

    private Color getRandomColor(){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B = (int)(Math.random()*256);
        Color color = new Color(R , G , B);
        return color;
    }

}