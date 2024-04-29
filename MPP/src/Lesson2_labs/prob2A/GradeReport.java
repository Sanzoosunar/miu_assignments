package Lesson2_labs.prob2A;

public class GradeReport {
    private String grade;
    private Student student;

    GradeReport(Student student){
        this.student = student;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }
    public Student getStudent(){
        return student;
    }

    public String getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return grade;
    }
}
