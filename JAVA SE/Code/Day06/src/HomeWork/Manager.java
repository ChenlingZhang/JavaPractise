package HomeWork;

public class Manager {
    private String name;
    private int number;
    private double salary;
    private double award;

    public Manager(){}

    public Manager(String name, int number, double salary, double award) {
        setName(name);
        setNumber(number);
        setSalary(salary);
        setAward(award);
    }
    public String intro(){
        return "经理姓名："+ name + "\n" + "工号：" + number;
    }

    public String showSalary(){
        return "基本工资为：" + salary + " 奖金: " + award ;
    }
    public String work(){
        return "正在努力做着管理工作";
    }
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getSalary() {
        return salary;
    }

    public double getAward() {
        return award;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAward(double award) {
        this.award = award;
    }
}
