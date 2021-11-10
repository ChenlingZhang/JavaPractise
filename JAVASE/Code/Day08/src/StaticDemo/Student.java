package StaticDemo;


public class Student {
    private String name;
    private int id;
    public static int numberOfStudents;

    public Student(String name){
        Student.numberOfStudents++;
        setName(name);
        setId(Student.numberOfStudents);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void show(){
        // 如果成员属于对象，则根据对象.name访问，this表示当前对象（this.name)
        // 如果成员属于类，则需要根据类名.name的方式进行访问
        System.out.println("学生姓名：" + this.name + " 学生学号：" + this.id + " 当前学生总人数：" + Student.numberOfStudents);
    }
}
