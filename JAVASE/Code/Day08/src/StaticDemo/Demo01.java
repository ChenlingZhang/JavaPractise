package StaticDemo;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Student.numberOfStudents);
        Student student = new Student("Jack");
        student.show();
        Student student1 = new Student("Have");
        student1.show();
    }
}
