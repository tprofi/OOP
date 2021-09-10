package com.javalesson.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    static void readFile() throws IOException {
        String FILE_NAME = "GradeBook.txt";
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String c;
        while ((c = reader.readLine()) != null) {
            System.out.println(c);
        }
    }
}