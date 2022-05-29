package com.example.sendhttprequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.github.com/users/google");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = reader.readLine()) != null){
            System.out.println(inputLine);
        }
        reader.close();
    }
}
