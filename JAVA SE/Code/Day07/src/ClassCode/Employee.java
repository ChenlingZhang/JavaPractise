package ClassCode;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(){}
    public Employee(String name, int id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name !=null && name !=" ") {
            this.name = name;
        }
        else{
            System.out.println("Employee Name Cannot be empty or Null");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
        else{
            System.out.println("ID cannot be a negative number");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }
        else {
            System.out.println("Salary cannot be a negative number");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
