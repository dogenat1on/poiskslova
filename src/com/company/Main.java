package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int count = 0, countLine = 0;
        String separator = File.separator;
        String path =  separator + "Users" +separator+ "svd09" +separator+ "Desktop" +separator+ "text.txt";
        String lineNumber = "";
        BufferedReader bufferedReader;
        String inputSearch = "зима";
        String line = "";

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    countLine++;
                    String[] words = line.split(" ");

                    for (String word : words) {
                        if (word.equals(inputSearch)) {
                            count++;
                            lineNumber += countLine + ",";
                        }
                    }

                }
lineNumber = lineNumber.substring(0,lineNumber.length()-1)+".";
                System.out.println("Количество =  " + count);
                System.out.println("Слово найдено в строке № " + lineNumber);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } finally {

        }
    }
}
