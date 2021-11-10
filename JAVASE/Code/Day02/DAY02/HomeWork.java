package Day02.DAY02;

import javax.print.event.PrintEvent;

public class HomeWork {
    public static void main(String[] args) {
        // case01();
        // case02();
        // case03();
        // case04();
        // case05();
        // case06();
        case07();
    }

    public static void case01(){
        int i1 = 0;
        int i2 = 10;
        while(i1 < 5){
            i1++;
            i2++;
            if(i1>=2 && i2<15){
                System.out.println("i: " + i1 +" , " + "i2: " +i2);
            }
        }
        System.out.println("---------------------------------");
        while(i2 < 20){
            i1++;
            i2++;
            System.out.println("i: " + i1 +" , " + "i2: " +i2);
        }

    }
    
    public static void case02(){
        double discount = 1;
        double totalPrice = 550;

        if(totalPrice >= 500){
            discount = 0.5;
            System.out.println("totalPrice:" + totalPrice);
            System.out.println("totalPrice的discount: " + totalPrice*discount );
        }
        else if(totalPrice >= 400){
            discount = 0.6;
            System.out.println("totalPrice:" + totalPrice);
            System.out.println("totalPrice的discount: " + totalPrice*discount );
        }
        else if(totalPrice >= 300){
            discount = 0.7;
            System.out.println("totalPrice:" + totalPrice);
            System.out.println("totalPrice的discount: " + totalPrice*discount );
        }
        else if(totalPrice >= 200){
            discount = 0.8;
            System.out.println("totalPrice:" + totalPrice);
            System.out.println("totalPrice的discount: " + totalPrice*discount );
        }
    }

    public static void case03(){
        for(int i = 10; i>=0; i-=2){
            System.out.print(i + " ");
        }
    }

    public static void case04(){
        int a = 10;
        int b = 20;
        int c = 30;

        method1();
        method2();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static void method1(){
        int a = -5;
        int b = --a;
        if(a%2==0){
            a = ++b;
        }
        else{
            b = --a;
        }

        System.out.println(a + " , " + b);
    }

    public static void method2(){
        int a = 0;
        while(a<=5){
            for(int b = 1; b<=5;b++){
                System.out.print(b + " ");
            }
            System.out.println("");
            a++;
        }
    }

    public static void case05(){
        int jj = 20;
        int a = 0;
        int b = 0;
        for(int ii = 0; ii < jj; ii+=2){
            jj--;
            if(ii%3 == 0){
                a = ii;
                System.out.println(ii + " Hello");
            }
            else{
                b = ii;
                System.out.println(ii + " World");
            }
        }
        System.out.println("a和b的乘积为：" + a + " * " + b + " = " + (a*b));
    }

    public static void case06(){
        String str = "J";
        for (int i = 0; i < 5; i++) {
            int key = i%3;
            switch(key){
                case 0:
                    str = str + 'a';
                    i++;
                    break;
                case 2:
                    str = str + 'V';
                    break;
            }

        }
        System.out.println(str);
    }

    public static void case07(){
        boolean bVar = false;
        boolean bVar1 = true;
        int count = 8;
        do{
            System.out.println("Hello Java! " + count);
            if(count>=7){
                bVar1 = false;
                count--;

            }else{
                count +=3;
            }
        }
        while(count<9&& bVar == bVar1);
    }

}
