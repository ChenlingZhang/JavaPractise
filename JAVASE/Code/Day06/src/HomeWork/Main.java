package HomeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("第一题：圆形计算器");
        Circle circle = new Circle(8);
        String result1 = circle.toString();
        System.out.println(result1);
        System.out.println("第二题：闰年计算器");
        MyDate date = new MyDate(1990,1,1);
        String result2 = date.toString();
        System.out.println(result2);
        System.out.println("第三题：打印扑克牌");
        Card card = new Card("黑桃","A");
        card.showCard();
        System.out.println("第四题：打印员工与管理员信息");
        Coder coder = new Coder("Kobe",0025,10000.0);
        String coderIntroduce = coder.intro();
        String coderSalary = coder.showSalary();
        String coderWork = coder.work();
        System.out.println(coderIntroduce + "\n"+coderSalary+"\n"+coderWork);
        System.out.println("==========================================>");
        Manager manager = new Manager("James",9527,15000.0,3000.0);
        String managerIntroduce = manager.intro();
        String managerSalary = manager.showSalary();
        String managerWork = manager.work();
        System.out.println(managerIntroduce + "\n" + managerSalary+"\n"+managerWork);
        System.out.println("第五题：老师和学生");
        Student student = new Student("周同学",18,"Java 面向对象的知识");
        Teacher teacher = new Teacher("韩老师",30,"Java 面向对象的知识");
        String studentEat = student.eat();
        String studentLearn = student.teach();
        String teacherEat = teacher.eat();
        String teacherLearn = teacher.teach();
        System.out.println(teacherEat);
        System.out.println(teacherLearn);
        System.out.println(studentEat);
        System.out.println(studentLearn);



    }

}
