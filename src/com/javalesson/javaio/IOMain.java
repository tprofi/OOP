package com.javalesson.javaio;

import com.javalesson.treemap.AverageStudentGrade;
import com.javalesson.treemap.SubjectGrade;
import com.javalesson.treemap.TreeMapRunner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class IOMain {
    private static final String FILE_NAME = "BankAccount.txt";
    private static final String BINARY_FILE_NAME = "BankAccount.bin";

    public static void main(String[] args) throws IOException {
        Writer writer = new Writer();
        Reader reader = new Reader();

        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        processGrades(grades, writer, BINARY_FILE_NAME);
        outputObjects(BINARY_FILE_NAME, reader);
        Writer.writeFile(grades, FILE_NAME);
        Reader.readFile(FILE_NAME);

    }

    private static void inputWrite(Scanner scanner) throws FileNotFoundException {
        Formatter formatter = new Formatter(FILE_NAME);

        System.out.println("Enter data");
        int i = 0;
        while (i < 3) {
            try {
                formatter.format("%d, %s, %s, %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect");
                scanner.nextLine();
            }
            formatter.close();
        }
    }

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName) throws IOException {
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
        }
        writer.writeObject(students, fileName);
    }

    private static void outputObjects(String fileName, Reader reader) throws IOException {
        List<Student> students = reader.readObjects(fileName);
        for (Student student : students) {
            System.out.printf("%s, %.2f %n", student.getName(), student.getAverageGrade());
            System.out.println(student.getGrades());
        }
    }
}
