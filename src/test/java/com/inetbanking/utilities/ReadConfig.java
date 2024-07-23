package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    public ReadConfig() {
        File file = new File("./Configuration/config.properties");

        FileInputStream fis;

        {
            try {
                fis = new FileInputStream(file);
                pro = new Properties();
                pro.load(fis);
            } catch (Exception e) {
                System.out.println("Exception is " + e.getMessage());
            }
        }

    }

    public String getApplicationURL(){
        String baseUrl = pro.getProperty("baseURL");
        return baseUrl;
    }


    public String getUserName(){
        String userName = pro.getProperty("userName");
        return userName;

    }

    public String getPassword(){
        String password = pro.getProperty("password");
        return password;
    }
}
