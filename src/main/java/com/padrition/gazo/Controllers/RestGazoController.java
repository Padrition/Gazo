package com.padrition.gazo.Controllers;

import java.io.IOException;

import com.padrition.gazo.ImageClasses.ImageBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestGazoController {

    @Autowired
    ImageBuilder imageBuilder;

    @GetMapping(
        value  = "/generateImageWithRandomColors",
        produces = MediaType.IMAGE_PNG_VALUE
    )
    public byte[] getGenerateImageWithRandomColors()throws IOException{
        return imageBuilder.generateImageWithRandomColors();
    }

    @GetMapping(
        value  = "/generateImageWithRandomColors/{sizeOfBox}",
        produces = MediaType.IMAGE_PNG_VALUE
    )
    public byte[] getGenerateImageWithRandomColors(@PathVariable("sizeOfBox")int sizeOfBox)throws IOException{
        return imageBuilder.generateImageWithRandomColors(sizeOfBox);
    }

    @GetMapping(
        value = "/generateImageWithNumberOfColors{numberOfColors}",
        produces = MediaType.IMAGE_PNG_VALUE
    )
    public byte[] getGenerateImageWithNumberOfColors(@PathVariable("numberOfColors")int numberOfColors)throws IOException{
        return imageBuilder.generateImageWithNumberOfColors(numberOfColors);
    }

    @GetMapping(
        value = "/generateImageWithNumberOfColors{numberOfColors}/{sizeOfBox}",
        produces = MediaType.IMAGE_PNG_VALUE
    )
    public byte[] getGenerateImageWithNumberOfColors(@PathVariable("numberOfColors")int numberOfColors,@PathVariable("sizeOfBox")int sizeOfBox)throws IOException{
        return imageBuilder.generateImageWithNumberOfColors(numberOfColors , sizeOfBox);
    }

    @GetMapping(
        value= "/generateImageWithCertainColors/{colorsLine}",
        produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getGenerateImageWithCertainColors(@PathVariable("colorsLine")String colorsLine)throws IOException{
            return imageBuilder.generateImageWithCertainColors(imageBuilder.obtainColorsFromString(colorsLine));
    }

    @GetMapping(
        value= "/generateImageWithCertainColors/{colorsLine}/{sizeOfBox}",
        produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getGenerateImageWithCertainColors(@PathVariable("colorsLine")String colorsLine, @PathVariable("sizeOfBox")int sizeOfBox)throws IOException{
            return imageBuilder.generateImageWithCertainColors(sizeOfBox, imageBuilder.obtainColorsFromString(colorsLine));
    }
}