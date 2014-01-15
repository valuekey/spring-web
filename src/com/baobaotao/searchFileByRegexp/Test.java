package com.baobaotao.searchFileByRegexp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String path = Class.class.getClass().getResource("/com/baobaotao/searchFileByRegexp/tabledata.sql").getPath();
        File file = new File(path);
        BufferedReader reader = null;
        if(file.exists()){
            try {
                reader = new BufferedReader(new FileReader(file));
                
                String tempString = null;
                
                StringBuilder builder = new StringBuilder();
                
                while ((tempString = reader.readLine()) != null) {
                    if (tempString.startsWith("DROP TABLE")){
                        builder.append(tempString);
                    }
                }
                
                System.out.println(builder);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                if (reader!=null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
