package Day11.Practice1;

public class Test {
    public static void main(String[] args) {
        String num = "23.23456789";
        HandleAble number =  new HandleAble() {
            @Override
            public void HandleString(String num) {
                // 将传入的String类型数字转型成Double类型
                double doubleNum = Double.parseDouble(num);
                // 打印原数字
                System.out.println("原数字：" + doubleNum);
                // 将double类型数字向下转型成int取整数
                int doubleToInt = (int) doubleNum;
                System.out.println("取整后：" + doubleToInt);
                // 将double类型数字进行四舍五入
                System.out.printf("%s%.4f%n","保留四位小数后：",doubleNum);
            }
        };
        number.HandleString(num);
    }
}
