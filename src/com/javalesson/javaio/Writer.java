package com.javalesson.javaio;

import com.javalesson.treemap.AverageStudentGrade;
import com.javalesson.treemap.SubjectGrade;

import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;

public class Writer {

    static void writeFile(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            fileWriter.write("==========================================\n");
            fileWriter.write("Student: " + gradeKey.getName() + " Average Grade: " + gradeKey.getAverageGrade() + "\n");
            for (SubjectGrade grade : grades.get(gradeKey)) {
                fileWriter.write("Subject: " + grade.getSubject() + " Grade: " + grade.getGrade() + "\n");
            }
        }
        fileWriter.close();
    }

    public void writeObject(List<Student> studentList, String fileName) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
        try {
            for (Student student : studentList) {
                out.writeObject(student);
            }
        } catch (IOException e) {
            System.out.println("File corrupt. Terminate process");
            e.printStackTrace();
        }
        out.close();
    }
}