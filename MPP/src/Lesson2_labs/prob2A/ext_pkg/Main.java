package Lesson2_labs.prob2A.ext_pkg;

import Lesson2_labs.prob2A.*;

public class Main {

    public static void main(String[] args) {

        /*
         * Create a student and assign it a grade
         */
        Student student = new Student("Luwam");
        student.getGradeReport().setGrade("A");
        System.out.println(student);

        /*
         * Get the gradeReport object of the created student and show the grade
         */
        GradeReport gradeReport = student.getGradeReport();
        System.out.println(gradeReport.getGrade());
    }
}
