package org.csystem.app.simulation.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    public String lectureName;
    public int [][] grades;
    public double [] averages;
    public double average;

    public void fillGrades()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.printf("%s sınavına giren şube sayısını giriniz:", lectureName);
        grades = new int[Integer.parseInt(kb.nextLine())][];
        averages = new double[grades.length];

        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d.şubenin öğrenci sayısı?", i + 1);
            grades[i] = ArrayUtil.getRandomArray(r, Integer.parseInt(kb.nextLine()), 0, 101);
        }
    }

    public void calculateResults()
    {
        int totalNumberOfStudents = 0;
        int totalGrades = 0;

        for (int i = 0; i < grades.length; ++i) {
            int total = ArrayUtil.sum(grades[i]);

            averages[i] = (double)total / grades[i].length;
            totalGrades += total;
            totalNumberOfStudents += grades[i].length;
        }
        average = (double)totalGrades / totalNumberOfStudents;
    }

    public ExamSimulation(String name)
    {
        lectureName = name;
    }

    public void run()
    {
        fillGrades();
        calculateResults();
    }

    public void printAverages()
    {
        System.out.printf("%s dersi için not ortalamaları:%n", lectureName);
        System.out.println("----------------------------------------------------------------------------------------");
        for (int i = 0; i < averages.length; ++i)
            System.out.printf("%d.şube not ortalaması:%f%n", i + 1, averages[i]);

        System.out.printf("Okul ortalaması:%f%n", average);
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public void printGrades()
    {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%s dersi sınav notları:%n", lectureName);
        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d.şube sınav notları:", i + 1);
            ArrayUtil.print(2, grades[i]);
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public void printReport()
    {
        System.out.println("###########################################################################################");
        printGrades();
        printAverages();
        System.out.println("###########################################################################################");
    }
}
