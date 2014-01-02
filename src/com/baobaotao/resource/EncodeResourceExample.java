package com.baobaotao.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

public class EncodeResourceExample {
    public static void main(String[] args) throws Throwable {

        //System.out.println(System.getProperty("java.class.path"));
        Resource res = new ClassPathResource("overview.html");
        EncodedResource encRes = new EncodedResource(res,"UTF-8");
        String content = FileCopyUtils.copyToString(encRes.getReader());
        System.out.println(content);
        
        
    }

}
