package com.ahmed.app.file.impl;

import com.ahmed.app.file.ImageProcessor;
import org.springframework.stereotype.Component;
@Component
public class SimpleImageProcessor implements ImageProcessor {

	
        @Override
	public void process(String image) {

		System.out.println("image: " + image  + " resized successfully..");
		System.out.println("image: " + image  + " compresed successfully..");
	}

}
