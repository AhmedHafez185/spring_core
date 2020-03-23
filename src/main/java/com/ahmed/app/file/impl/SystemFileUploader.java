package com.ahmed.app.file.impl;

import com.ahmed.app.file.FileUploader;
import com.ahmed.app.file.ImageProcessor;
import com.ahmed.app.file.impl.CloudFileUploader;
import org.springframework.beans.factory.annotation.Qualifier;


public class SystemFileUploader implements FileUploader {

	ImageProcessor imageProcessor;
	
	
	public SystemFileUploader(@Qualifier("simpleImageProcessor")ImageProcessor imageProcessor) {
		super();
		this.imageProcessor = imageProcessor;
	}

	@Override
	public String upload(String name, boolean isImage) {

		System.out.println("file with name "+ name +" uploaded successfully to system..");
		
		if(isImage) {
			imageProcessor.process(name);
		}
		
		return name;
	}

	@Override
	public boolean delete(String fileId) {

		System.out.println("file with id: " + fileId + " deleted successfully..");
		
		return true;
	}
	
}
