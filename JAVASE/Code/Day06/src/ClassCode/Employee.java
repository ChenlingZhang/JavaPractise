package ClassCode;

// 员工类
public class Employee {
    // 姓名、工号、工资
   private String name;
   private int number;
   private double salary;

   // 构造函数
   public Employee(){

   }

   // 满构造函数
    public Employee(String name, int number, double salary){
       setName(name);
       setNumber(number);
       setSalary(salary);
    }




   public void setName(String name){
       if (name == " "|| name == null){
           System.out.println("姓名输入非法");
       }
       else {
           this.name = name;
       }
   }
   public void setNumber(int number){
       if(number < 0){
           System.out.println("工号不可以小于0");
       }
       this.number = number;
   }
   public void setSalary(double salary){
       if (salary >= 2000 & salary<=100000){
           this.salary = salary;
       }
       else{
           System.out.println("输入的薪资不可以小于0");
       }

   }
   public String getName(){
       if(name ==" " || name == null) {
           System.out.println("getName 输入非法");
       }
       return name;
   }
   public int getNumber(){
       if (number < 0){
           System.out.println("getNumber 输入非法");
       }
       return number;
   }
   public double getSalary(){
       if(salary<2000&&salary>100000){
           System.out.println("getSalary 输入非法");
       }
       return salary;
   }

   public String toString(){
       return "Name: " + name + " " + "Number: " + number + " " + "Salary: " + salary;
   }

}
