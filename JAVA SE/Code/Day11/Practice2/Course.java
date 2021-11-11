package Day11.Practice2;

import java.util.ArrayList;

public class Course     {
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> studentList;
    public Course(){};
    public Course(String courseName, Teacher teacher, ArrayList<Student> studentList) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.studentList = studentList;
    }
    public void show(String courseName, Teacher teacher, ArrayList<Student> studentList){
        System.out.println("课程名称： " + courseName);
        System.out.println("授课老师： " + teacher.getName());
        for (Student student: studentList) {
            teacher.checkAttendence(student);
            System.out.println(student.getAttendence() + ": " +student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
