package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Solution_8 {
    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = Solution_8.class.getClassLoader().getResourceAsStream("test.properties"); // We need to get classloader

        Properties properties = new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.get("username"));
    }
}
