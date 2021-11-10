package ClassCode;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = initData();
        printData(employees);
        double maxSalary = maxSalary(employees);
        System.out.println("The max salary is: " + maxSalary);
        double averageSalary = avgSalary(employees);
        System.out.println("The average salary is: " + averageSalary);

    }

    /**
     *
     * @return Employee List
     */
    public static Employee[] initData(){
        Employee[] employees = new Employee[3];
        Employee employee1 = new Employee("Tom",1,10000);
        Employee employee2 = new Employee("Jack",2,7000);
        Employee employee3 = new Employee("Nacy",3,8000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        return employees;
    }

    /**
     *
     * @param employees
     */
    public static void printData(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    /**
     *
     * @param employees
     * @return Max Salary
     */
    public static double maxSalary(Employee[] employees){
        double maxNumber = 0;
        for (Employee employee:employees) {
            if (employee.getSalary() > maxNumber){
                maxNumber = employee.getSalary();
            }
        }

        return maxNumber;
    }

    /**
     *
     * @param employees
     * @return average salary
     */
    public static double avgSalary(Employee[] employees){
        double totalSalary = 0;
        for (Employee employee: employees) {
            totalSalary+=employee.getSalary();
        }
        return Math.floor(totalSalary/ employees.length);
    }



}
