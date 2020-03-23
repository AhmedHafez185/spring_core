package com.ahmed.app;

import com.ahmed.app.file.FileUploader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        FileUploader fileUploader = context.getBean("cloudFileUploader",FileUploader.class);
        fileUploader.upload("file", true);
        context.close();
               

    }

}
