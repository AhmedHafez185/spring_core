package com.ahmed.app.file;

public interface FileUploader {	

	public String upload(String name, boolean isImage);
	
	public boolean delete(String fileId);
	
}
