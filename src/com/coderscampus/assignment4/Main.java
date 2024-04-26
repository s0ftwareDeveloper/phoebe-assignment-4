package com.coderscampus.assignment4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main
{

    private final static String FILE = "src/student-master-list.csv";

    public static void main(String[] args) throws IOException {

        FileProcessor fp = new FileProcessor(FILE);

        // reads file and gets student objects into array
        Student[] allStudents = fp.readFromFile();

        // comp sci prof
        CompSciProf csProf = new CompSciProf(allStudents);
        APMathProf apMathProf = new APMathProf(allStudents);
        StatsProf statsProf = new StatsProf(allStudents);

        // output to csv files
        fp.writeToFile("course1.csv", csProf.getStudents());
        fp.writeToFile("course2.csv", apMathProf.getStudents());
        fp.writeToFile("course3.csv", statsProf.getStudents());

    }
}
