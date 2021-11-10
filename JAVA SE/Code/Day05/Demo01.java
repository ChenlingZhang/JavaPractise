package Day05;
/**
 * 数组：就是一组数据
 * 工资计算器，主要统计英法工资总额，最高工资，平均工资
 */
public class Demo01 {
    public static void main(String[] args) {
        double[] salary = initSalaryData();
        double totalSalary = totalSalary(salary);
        System.out.println("工资总和为：" + totalSalary);
        double averageSalary = averageSalary(totalSalary, salary);
        System.out.println("平均工资为：" + averageSalary);
        double highesSalary = highesSalary(salary);
        System.out.println("最高工资为: " + highesSalary);

        
    }
    /**
     * 初始化工资数据，因为没有数据输入，此处写死为固定数据
     * @return Double 类型数组，初始化工资、
     */
    public static double[] initSalaryData(){
        double[] salary = new double[5];
        salary[0] = 9000.0;
        salary[1] = 7500.0;
        salary[2] = 10000.0;
        salary[3] = 12000.0;
        salary[4] = 50000.0;
        return salary;

    }

    /**
     * 输入工资数组，返回double类型工资总和
     * @param double[] double类型数组
     * @return double类型工资总和
     */

    public static double totalSalary(double [] salary){
        double totalSalary = 0.0;

        for(int i = 0; i<salary.length;i++){
            totalSalary += salary[i];
        }
        return totalSalary;
    }
    
    /**
     * 
     * @param totalSalary 工资总和
     * @param salary 工资数组
     * @return 平均工资
     */
    public static double averageSalary(double totalSalary, double[] salary){
        return totalSalary/(salary.length);
    }
    /**
     * 
     * @param salary 工资数组
     * @return 最大工资
     */
    public static double highesSalary(double[] salary){
        double pointer = 0;
        for (int i = 0; i < salary.length; i++) {
            if(pointer < salary[i]){
                pointer = salary[i];
            }
        }
        return pointer;
    }
}


