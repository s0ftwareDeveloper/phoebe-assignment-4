package com.coderscampus.assignment4;

import java.util.Arrays;

public class APMathProf extends Professor
{
    private final String COURSE_CODE = "APMTH";

    APMathProf(Student[] allStudents) {
        this.setCourseCode(COURSE_CODE);

        //get students for course
        Student[] apMathStudents = this.getStudentsByCourse(allStudents);

        //sort students
        Arrays.sort(apMathStudents);

        //sets students
        this.setStudents(apMathStudents);
    }
}
