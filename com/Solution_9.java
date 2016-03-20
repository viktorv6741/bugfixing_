package com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Solution_9 {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");  // I think we need to create this file, at first.
        if(!file.exists()) {
            file.createNewFile();
        }

        System.out.println(file.exists());

        Scanner scan = new Scanner(file);

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();
    }
}
