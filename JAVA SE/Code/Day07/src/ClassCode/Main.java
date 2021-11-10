package ClassCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (isContinue){
            functionList();
            int choice = in.nextInt();
            switch (choice){
                // 打印员工列表
                case 1:
                    if (employees.size() == 0){

                        System.out.println("There has no Employee in the list!!!");
                        System.out.println(" ");
                        break;
                    }
                    else{
                        System.out.println("Here is the list: ");
                        System.out.println(employees.toString());
                    }
                    break;
                // 添加员工
                case 2:
                    Scanner scanner = new Scanner(System.in);
                    employees.add(addEmployee(scanner));
                    System.out.println("Successfully add an Employee !!!");
                    break;
                // 显示最高工资
                case 3:
                    if (employees.size() > 0 ){
                        double highestSalary = 0;
                        for (Employee e: employees) {
                            highestSalary = highestSalary(e.getSalary());
                            System.out.println("The highest salary is: " + highestSalary);
                            System.out.println(" ");
                        }
                        break;
                    }
                    else {
                        System.out.println("There has no Employees in the list!!!");
                        System.out.println(" ");
                        break;
                    }
                case 4:
                    if (employees.size()>0){
                        for (Employee e: employees) {
                            double totalSalary = totalSalary(e.getSalary());
                            System.out.println("The total salary is: " + totalSalary);
                            System.out.println(" ");
                        }
                        break;
                    }
                    else {
                        System.out.println("There has no employees in the list !!!");
                        System.out.println(" ");
                    }

                case 5:
                    double averageSalary = averageSalary(employees);
                    System.out.println("The average Salary is : " + averageSalary);
                    System.out.println(" ");
                case 6:
                    if (employees.size() > 0){
                        getRewardID(employees);
                    }
                    else {
                        System.out.println("There has no employees in the list !!!");
                        System.out.println(" ");
                    }
                    break;
                case 7:
                    System.out.println("Exit System");
                    isContinue = false;
                    break;
            }
        }



    }

    public static void functionList(){
        System.out.println("Welcome to use employee manage system: ");
        System.out.println("1. Print all Employee");
        System.out.println("2. Add a new Employee");
        System.out.println("3. Show employee who has highest salary");
        System.out.println("4. Print total salary ");
        System.out.println("5. Print Average salary ");
        System.out.println("6. Show employee who got the reward");
        System.out.println("7. Exit");
        System.out.println("Please Enter Your Action");
    }

    public static Employee addEmployee(Scanner scanner){
        Employee employee = new Employee();
        System.out.println("Please Enter Employee name:");
        String name = scanner.nextLine();
        System.out.println("Please Enter Employee ID:");
        int id = scanner.nextInt();
        System.out.println("Please Enter Employee Salary:");
        double salary = scanner.nextDouble();
        employee.setName(name);
        employee.setId(id);
        employee.setSalary(salary);
        return employee;
    }


    /**
     * total salary
     * @param salary
     * @return double
     */
    public static double totalSalary(double salary){
        double totalSalary = 0;
        totalSalary += salary;
        return totalSalary;
    }


    /**
     * 返回最高工资
     * @param salary
     * @return int highest salary
     */
    public static double highestSalary(double salary){
        double highestSalary = 0;
        if (salary > highestSalary){
            highestSalary = salary;
        }
        else{
            highestSalary = highestSalary;
        }
        return highestSalary;
    }

    /**
     * 返回平均工资值（Double类型）
     * @param employees
     * @return averageSalary
     */
    public static double averageSalary(ArrayList<Employee> employees){
        double average = 0.0;
        if (employees.size() < 0){
            System.out.println("There has no employees in the list !!!");
            System.out.println(" ");
        }
        else {
            for (Employee e: employees) {
                average = totalSalary(e.getSalary())/employees.size();
            }
        }
        return  average;
    }

    /**
     * 打印获奖员工姓名，以及员工ID
     * @param employees 传入员工列表
     */
    public static void getRewardID(ArrayList<Employee> employees){
        Random random = new Random();
        int rewardNum = random.nextInt(employees.size());
        Employee employee = employees.get(rewardNum);
        System.out.println("获奖员工是： " + employee.getName() + " " + employee.getId());
    }


}
