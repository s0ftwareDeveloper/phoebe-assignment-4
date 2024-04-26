package com.coderscampus.assignment4;

import java.util.Arrays;

public class CompSciProf extends Professor {

    private final String COURSE_CODE = "COMPSCI";

    CompSciProf(Student[] allStudents) {
        this.setCourseCode(COURSE_CODE);

        //get students for course
        Student[] compSciStudents = this.getStudentsByCourse(allStudents);

        //sort students
        Arrays.sort(compSciStudents);

        //sets students
        this.setStudents(compSciStudents);
    }
}
