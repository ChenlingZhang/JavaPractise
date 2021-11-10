package HomeWork;

public class Coder {
    private String name;
    private int number;
    private double salary;

    public Coder(){}
    public Coder(String name, int number, double salary){
        setName(name);
        setNumber(number);
        setSalary(salary);
    }

    public String intro(){
        return "程序员姓名："+ name + "\n" + "工号：" + number;
    }

    public String showSalary(){
        return "基本工资为：" + salary + " 奖金无";
    }

    public String work(){
        return "正在努力写代码";
    }


    public void setName(String name){
        if (name == null){
            System.out.println("Please Check Colder Name");
        }
        else{
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }
    public void setNumber(int number){
        if (number < 0){
            System.out.println("Colder ID cannot less than 0");
        }
        else {
            this.number = number;
        }
    }
    public int getNumber(){return number;}
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative");
        } else {
            this.salary = salary;
        }

    }
    public double getSalary(){
        return salary;
    }

}
