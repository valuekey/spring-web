package com.baobaotao.resource;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class FileSourceExample {
    public static void main(String[] args) {
        try {
            String filePath = "D:/file.txt";
            String classPath = "overview.html";
            Resource res1 = new FileSystemResource(filePath);
            Resource res2 = new ClassPathResource(classPath);

            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();

            System.out.println("res1:" + res1.getFilename());
            System.out.println("res2:" + res2.getFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
