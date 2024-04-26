package com.coderscampus.assignment4;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private Integer studentId;
    private String studentName;
    private String course;
    private Integer grade;

    Student(String studentId, String studentName, String course, String grade) {
        this.studentId = Integer.parseInt(studentId);
        this.studentName = studentName;
        this.course = course;
        this.grade = Integer.parseInt(grade);
    }

    /**
     * Defines how to compare students
     * @param that the object to be compared.
     * @return int defining how to compare
     */
    public int compareTo(Student that) {
        if (this.grade > that.grade) {
            return -1;
        } else if (this.grade.equals(that.grade)) {
            return 0;
        } else {
            return 1;
        }
    }

   /* *
    * getters and setters
    * */

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
