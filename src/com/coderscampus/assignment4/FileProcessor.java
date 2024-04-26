package com.coderscampus.assignment4;

import java.io.*;

public class FileProcessor {
    private final String fileName;
    private final Integer FILE_ENTRIES = 100;
    private String fileHeader;

    FileProcessor(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Reads input file
     * @return array of Students
     */
    public Student[] readFromFile() throws IOException {
        // array for students
        Student[] students = new Student[FILE_ENTRIES];

        //read students from file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = bufferedReader.readLine();

            // save first file line
            fileHeader = line;
            int i = 0;

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");

                Student student = new Student(values[0], values[1], values[2], values[3]);
                students[i] = student;
                i++;
            }

            return students;
        }
    }

    /**
     * Writes from input Student array to desired file in csv format
     * @param fileName name of file to write to
     * @param students student data to write to the file
     */
    public void writeToFile(String fileName, Student[] students) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {

            // first file line
            bufferedWriter.write(fileHeader + "\n");

            // loop through students and output each to file
            for(Student student : students)
            {
                String out = student.getStudentId() + "," + student.getStudentName() + "," + student.getCourse() + ","  + student.getGrade() + "\n";
                bufferedWriter.write(out);
            }

        }
    }

}
