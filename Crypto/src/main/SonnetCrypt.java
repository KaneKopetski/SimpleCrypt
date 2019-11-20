package main;

import java.io.*;

public class SonnetCrypt {
    public static String readFile() {
        StringBuilder output = new StringBuilder();
        try {
            File file = new File("/Users/kane/Desktop/Dev/SimpleCrypt/sonnet18.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                output.append(st);
        } catch(Exception eee) {}
        return output.toString();
    }
}