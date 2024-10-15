package com.drakomichael.resources;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonObject;
import java.io.FileReader;

public class applicationProperties {
    private String url;
    private String username;
    private String password;

    public applicationProperties() {


        try (JsonReader jsonReader = Json.createReader(new FileReader("src/main/java/com/drakomichael/resources/applicationProperties.json"))) {
            JsonObject jsonObject = jsonReader.readObject();
            this.url = jsonObject.getString("url");
            this.username = jsonObject.getString("username");
            this.password = jsonObject.getString("password");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public String url() {
        return url;
    }
    public String username() {
        return username;
    }
    public String password() {
        return password;
    }
}
