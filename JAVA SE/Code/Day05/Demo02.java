package Day05;

public class Demo02 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("调用update方法之前：" + num1);
        updateBaseType(num1);
        System.out.println("调用update方法之后：" + num1);
    }

    public static void updateBaseType(int num){
        num = 10;
    }
    
}
