package Day01;

public class Practise{
    public static void main(String[] args){
        System.out.println("善学如春起之苗");
        System.out.println("不见其增，日有所长");
        System.out.println("假学如磨刀之石");
        System.out.println("不见其损，年有所亏");
        System.out.println("加油吧！少年");
        System.out.println("J");
        System.out.println("A");
        System.out.println("V");
        System.out.println("A");

        System.out.println(-2147483648);
        System.out.println(-100);
        System.out.println(0);
        System.out.println(100);
        System.out.println(2147483647);
        System.out.println(-100.0);
        System.out.println(-10.0);
        System.out.println(0.0);
        System.out.println(10.9);
        System.out.println(100.9);

        System.out.println("true");
        System.out.println("false");


        int a = 10; 
        int b = 20;
        int temp = 0;
        System.out.println("互换前：");
        System.out.println(a);
        System.out.println(b);

        temp = a;
        a=b;
        b=temp;
        System.out.println("互换后：");
        System.out.println(a);
        System.out.println(b);
        
        byte c = 2;
        int i = 1;
        System.out.println(c+i);

        short s = 1;
        s = (short)(s + 1);
        System.out.println(s);

        short s2 = 32767;
s2 = (short)(s+10);
System.out.println(s2);
int num = 1;
  // 1: 把num赋值个num2变量，num2 = 1
  // 2: num 自增1， num = 2
  int num2 = num++;
  // 1：把num自增1，num = 3
  // 2：把num 赋值给num3， num3 =3
  int num3 = ++num;
  System.out.println(num2);
  System.out.println(num3);

    }
}