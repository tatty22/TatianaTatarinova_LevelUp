package ru.levelup.tatiana.tatarinova.qa.homework_5.dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = "./src/main/resources/config.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            properties.load(reader);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl(){
        String url = properties.getProperty("url");
        if (url != null) {
            return url;
        }
        else throw new RuntimeException("url не найден в файле congig.properties");
    }

    public String getUserName(){
        String userName = properties.getProperty("username");
        if (userName != null) {
            return userName;
        }
        else throw new RuntimeException("username не найден в файле congig.properties");
    }

    public String getPassword(){
        String password = properties.getProperty("password");
        if (password != null) {
            return password;
        }
        else throw new RuntimeException("password не найден в файле congig.properties");
    }

    public String getName(){
        String name = properties.getProperty("name");
        if (name != null) {
            return name;
        }
        else throw new RuntimeException("name не найден в файле congig.properties");
    }

    public String getEmail(){
        String email = properties.getProperty("email");
        if (email != null) {
            return email;
        }
        else throw new RuntimeException("email не найден в файле congig.properties");
    }

    public String getNewPassword(){
        String newpassword = properties.getProperty("newpassword");
        if (newpassword != null) {
            return newpassword;
        }
        else throw new RuntimeException("newpassword не найден в файле congig.properties");
    }

    public String getBirthday(){
        String birthday = properties.getProperty("birthday");
        if (birthday != null) {
            return birthday;
        }
        else throw new RuntimeException("birthday не найден в файле congig.properties");
    }

    public String getstartDate(){
        String startDate = properties.getProperty("startDate");
        if (startDate != null) {
            return startDate;
        }
        else throw new RuntimeException("startDate не найден в файле congig.properties");
    }

    public String getHobby(){
        String hobby = properties.getProperty("hobby");
        if (hobby != null) {
            return hobby;
        }
        else throw new RuntimeException("hobby не найден в файле congig.properties");
    }
}
