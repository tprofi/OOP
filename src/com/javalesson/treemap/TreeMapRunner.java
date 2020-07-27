package com.javalesson.treemap;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = createGrades();
        printGrades(grades, true);
    }

    private static void printGrades(Map<AverageStudentGrade, Set<SubjectGrade>> grades, boolean printValue) {
        Set<AverageStudentGrade> averageStudentGrades = grades.keySet();

        for (AverageStudentGrade gr : averageStudentGrades) {
            System.out.println(gr);
            if (printValue) {
                System.out.println(grades.get(gr));
            }
        }
    }

    public static NavigableMap<AverageStudentGrade, Set<SubjectGrade>> createGrades() {
        Set<SubjectGrade> alexGrades = new HashSet<>();
        alexGrades.add(new SubjectGrade("Mathematics", 85));
        alexGrades.add(new SubjectGrade("Biology", 85));
        alexGrades.add(new SubjectGrade("History", 85));
        alexGrades.add(new SubjectGrade("Physics", 85));
        alexGrades.add(new SubjectGrade("English", 85));

        Set<SubjectGrade> philGrades = new HashSet<>();
        philGrades.add(new SubjectGrade("Mathematics", 85));
        philGrades.add(new SubjectGrade("Biology", 85));
        philGrades.add(new SubjectGrade("History", 85));
        philGrades.add(new SubjectGrade("Physics", 85));
        philGrades.add(new SubjectGrade("English", 85));

        Set<SubjectGrade> andreyGrades = new HashSet<>();
        andreyGrades.add(new SubjectGrade("Mathematics", 85));
        andreyGrades.add(new SubjectGrade("Biology", 85));
        andreyGrades.add(new SubjectGrade("History", 85));
        andreyGrades.add(new SubjectGrade("Physics", 85));
        andreyGrades.add(new SubjectGrade("English", 85));

        Set<SubjectGrade> ritaGrades = new HashSet<>();
        ritaGrades.add(new SubjectGrade("Mathematics", 85));
        ritaGrades.add(new SubjectGrade("Biology", 85));
        ritaGrades.add(new SubjectGrade("History", 85));
        ritaGrades.add(new SubjectGrade("Physics", 85));
        ritaGrades.add(new SubjectGrade("English", 85));

        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> map = new TreeMap<>();
        map.put(new AverageStudentGrade("Alex", calcAverage(alexGrades)), alexGrades);
        map.put(new AverageStudentGrade("Phil", calcAverage(philGrades)), philGrades);
        map.put(new AverageStudentGrade("Andrey", calcAverage(andreyGrades)), andreyGrades);
        map.put(new AverageStudentGrade("Rita", calcAverage(ritaGrades)), ritaGrades);

        return map;
    }

    private static float calcAverage(Set<SubjectGrade> grades) {
        float sum = 0f;
        for (SubjectGrade sg : grades) {
            sum += sg.getGrade();
        }
        return sum / grades.size();
    }

}
