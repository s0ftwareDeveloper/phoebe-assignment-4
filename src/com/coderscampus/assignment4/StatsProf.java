package com.coderscampus.assignment4;

import java.util.Arrays;

public class StatsProf extends Professor
{
    private final String COURSE_CODE = "STAT";

    StatsProf(Student[] allStudents) {
        this.setCourseCode(COURSE_CODE);

        //get students for course
        Student[] statsStudents = this.getStudentsByCourse(allStudents);

        //sort students
        Arrays.sort(statsStudents);

        //sets students
        this.setStudents(statsStudents);
    }
}
