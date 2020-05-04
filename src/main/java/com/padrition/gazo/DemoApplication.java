package com.padrition.gazo;

import java.io.IOException;

import com.padrition.gazo.ImageClasses.ImageBuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException{
		SpringApplication.run(DemoApplication.class, args);
		ImageBuilder iBuilder = new ImageBuilder();
		iBuilder.generateImageWithRandomColors();
	}

}
