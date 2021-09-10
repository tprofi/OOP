package com.javalesson.javaio;

import com.javalesson.treemap.AverageStudentGrade;
import com.javalesson.treemap.SubjectGrade;
import com.javalesson.treemap.TreeMapRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NavigableMap;
import java.util.Set;

public class Writer {


    static void writeFile() throws IOException {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        String FILE_NAME = "GradeBook.txt";
        FileWriter fileWriter = new FileWriter(FILE_NAME);
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            fileWriter.write("==========================================\n");
            fileWriter.write("Student: " + gradeKey.getName() + " Average Grade: " + gradeKey.getAverageGrade() + "\n");
            for (SubjectGrade grade : grades.get(gradeKey)) {
                fileWriter.write("Subject: " + grade.getSubject() + " Grade: " + grade.getGrade() + "\n");
            }
        }
        fileWriter.close();
    }
}