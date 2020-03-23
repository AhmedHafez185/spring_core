package com.ahmed.app.file.impl;

import com.ahmed.app.file.FileUploader;
import com.ahmed.app.file.ImageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class CloudFileUploader implements FileUploader {
    @Value("${cloud.provider}")
    private String cloudProvider ;
    
        @Autowired
	private ImageProcessor imageProcessor;
	
//	public CloudFileUploader(ImageProcessor imageProcessor){
//            super();
//            this.imageProcessor = imageProcessor;
//      }
	@Override
	public String upload(String name, boolean isImage) {

		System.out.println("file with name "+ name +" uploaded successfully to cloud.." + cloudProvider);
		if(isImage) {
			imageProcessor.process(name);
		}
		
		return name;
	}

	@Override
	public boolean delete(String fileId) {

		System.out.println("file with id: " + fileId + " deleted successfully from cloud..");
		
		return true;
	}

    public String getCloudProvider() {
        return cloudProvider;
    }

    public void setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
    }

     public ImageProcessor getImageProcessor() {
        return imageProcessor;
    }
     
    public void setImageProcessor(ImageProcessor imageProcessor) {
        this.imageProcessor = imageProcessor;
    }
    
    public void init(){
        System.out.println("cloud file uploader init..");
    }
    public void destroy(){
        System.out.println("cloud file uploader destroy..");
    }

	
}
