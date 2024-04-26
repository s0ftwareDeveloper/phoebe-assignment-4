package com.coderscampus.assignment4;

public abstract class Professor {
    private String courseCode;
    private Student[] students;

    /**
     * Gets number of students in the course
     * (for purpose of initializing array with size of exact number of students)
     * @param allStudents all students in the file
     * @return number of students in particular course
     */
    public Integer numStudentsInCourse(Student[] allStudents) {
        int i = 0;
        for (Student student : allStudents) {
            if (student.getCourse().startsWith(courseCode)) {
                i++;
            }
        }
        return i;
    }

    /**
     * Gets students that are in a particular course
     * @param allStudents all students in all courses
     * @return array of Students in a particular course
     */
    public Student[] getStudentsByCourse(Student[] allStudents) {
        Student[] sortedStudents = new Student[numStudentsInCourse(allStudents)];
        int i = 0;
        for (Student student : allStudents) {
            if (student.getCourse().startsWith(courseCode)) {
                sortedStudents[i] = student;
                i++;
            }
        }

        return sortedStudents;
    }

    /* *
     * getters and setters
     * */

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

}
