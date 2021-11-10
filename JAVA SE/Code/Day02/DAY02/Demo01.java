package Day02.DAY02;
public class Demo01{
    public static void main(String[] args) {
       // swtichTest();
       // forTest01();
       // forTest02();
       whileTest();
    }

    public static void swtichTest(){
         // Switch 语法的应用
        /*
            需求：打印星期几 
            根据给定的数字，输出中文星期几
        */
        int day = 4;
        switch(day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入非法");
                break;

        }   
    }

    public static void forTest01(){
        for(int i = 1; i<=3;i++){
            System.out.printf("吃了%d碗饭\n",i);
        }
    }

    public static void forTest02(){
        int sum100 = 0;
        int oddSum = 0;
        // 计算0-100的和
        System.out.println("计算0-100的和");
        for(int i = 0; i<=100; i++){
            sum100 += i;
        }
        System.out.println("0-100之间整数的和：" + sum100);
        // 计算从0-100中的偶数和 
        System.out.println("计算0-100中的偶数和");
        for(int i = 0; i<=100; i++){
            if(i%2 == 0){
                oddSum += i;
            }
        }
        System.out.println("0-100之间偶数的和：" + oddSum);
    }

    public static void whileTest(){
        int point1 = 0;
        int point2 = 0;
        int sum100 = 0;
        int oddSum = 0;
         // 计算0-100的和
        while(point1 <=100){
            sum100 += point1;
            point1++;
        }
        System.out.println(sum100);
         // 计算从0-100中的偶数和
        while(point2 <=100){
            if(point2 %2==0){
                oddSum += point2;
            }
            point2++;
        } 
        System.out.println(oddSum);
    }
}