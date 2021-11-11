package Day11.Practice2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("小红",""));
        students.add(new Student("小亮",""));
        students.add(new Student("小明",""));
        Course course = new Course("Java", new Teacher("张老师"),students);
        course.show(course.getCourseName(), course.getTeacher(),course.getStudentList() );
    }
}
