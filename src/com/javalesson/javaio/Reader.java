package com.javalesson.javaio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName));
        String c;
        while ((c = reader.readLine()) != null) {
            System.out.println(c);
        }
        reader.close();
    }


    List<Student> readObjects(String fileName) {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
            while (true) {
                Student student = (Student) in.readObject();
                students.add(student);
            }
        } catch (EOFException e) {
            if ("".equals(e.getMessage())) {
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Invalid object");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Unable to open file.");
            e.printStackTrace();
        }
        return students;
    }

    void readFileFull(String filename) throws IOException {
        Path path = Paths.get(filename);

        List<String> lines = Files.readAllLines(path);
        for (String l : lines) {
            System.out.println(l);
        }
    }
}