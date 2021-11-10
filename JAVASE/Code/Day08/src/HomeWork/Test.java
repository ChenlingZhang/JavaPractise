package HomeWork;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("请输入需要反转的字符转：");
        //String input = in.nextLine();
        //System.out.println("需要反转的字符串为：" + input);
        //String s = turnGetString(input);
        //System.out.println("反转后的字符串为：" + s);
        //System.out.println("请输入要检查的QQ号码：");
        //String number = in.nextLine();
        //System.out.println("检查结果为：" + islegal(number));
        //System.out.println("请输入大字符串：");
        //String bigString = in.nextLine();
        //System.out.println("请输入小字符串：");
        //String smallString = in.nextLine();
        //System.out.println("小字符串 " + smallString + " 在大字符串中出现的次数为：" + appearCount(bigString,smallString));
        //System.out.println("请输入源字符：");
        //String origin = in.nextLine();
        //System.out.println("请输入要删除的字符：");
        //String delete = in.nextLine();
        //System.out.println("源字符总共包含 " + appearCount(origin,delete) + " 个 " + delete);
        //System.out.println("删除"+delete+"后的字符串为："+deleteString(origin,delete));
        //double randomNumber = Math.random()*100;
        //System.out.println("随机数为："+ randomNumber);
        //String formatNumber = String.format("%.2f",randomNumber);
        //System.out.println("转换为：" + formatNumber);
        //ArrayList<String>Stringlist = new ArrayList<>();
        //Stringlist.add("bca");
        //Stringlist.add("dadfa");
        //Stringlist.add("dddaaa");
        //Stringlist.add("你好啊");
        //Stringlist.add("我来啦,你干嘛呢");
        //Stringlist.add("别跑啊");
        //System.out.println("源字符串：" + Stringlist);
        //for (int i = 0; i <Stringlist.size() ; i++) {
        //    if (Stringlist.get(i).length()>5){
        //        Stringlist.remove(i);
        //    }
       // }
       // System.out.println("删除后字符串：" + Stringlist);
       // boolean b1 = isSame("mom");
       // boolean b2 = isSame("tomt");
       // System.out.println(b1);
       // System.out.println(b2);
        operation(1,"+",2);
        operation(1,"-",2);
        operation(1,"*",2);
        operation(1,"/",2);
        operation(1,"%",2);
        operation(1,"/",0);
        operation(1,"%",0);
        System.out.println(checkPassword("AZ123456"));
        System.out.println(checkPassword("123.456"));

    }
    // 反转字符串
    public static String turnGetString(String s){
        char[] stringArray = s.toCharArray();
        char[] newStringArray = new char[s.length()];
        int pointer = 0;
        for (int i = stringArray.length-1; i >= 0 ; i--) {
            newStringArray[pointer] = stringArray[i];
            pointer++;
        }

        return  new String(newStringArray);
    }
    // 判断输入字符是否合法
    public static boolean islegal(String s){
        if (s.length() < 5 || s.length()>12){
            return false;
        }
        if (s.charAt(0) == 0){
            return false;
        }
        for (int i = 0; i <s.toCharArray().length ; i++) {
            char c = s.charAt(i);
            if (c <'0'||c>'9'){
                return false;
            }
        }
        return true;
    }

    public static int appearCount(String bigString, String smallString){
        int count = 0;
        int index = 0;
        while ((index =bigString.indexOf(smallString,index))!= -1) {
            index++;
            count++;

        }
        return count;
    }

    public static String deleteString(String origin, String delete){
        return origin.replace(delete,"");
    }

    public static boolean isSame(String s1){
       int start = 0;
       int end = s1.length()-1;
       while (start<end){
           if (s1.charAt(start) != s1.charAt(end)){
               return false;
           }
           start++;
           end--;
       }
       return  true;
    }

    public static void operation(double d1, String operation, double d2){
        if (operation.equals("+")){
            System.out.println(d1 + " + " + d2 + " = " + (d1+d2));
        }
        else if (operation.equals("-")){
            System.out.println(d1 + " - " + d2 + " = " + (d1-d2));
        }
        else if (operation.equals("*")){
            System.out.println(d1 + " * " + d2 + " = " + (d1*d2));
        }
        else if (operation.equals("/")){
            if (d2==0){
                System.out.println("null");
            }
            else
                System.out.println(d1 + " / " + d2 + " = " + (d1/d2));
        }
        else if (operation.equals("%")){
            if (d2==0){
                System.out.println("null");
            }
            else
                System.out.println(d1 + " % " + d2 + " = " + (d1%d2));
        }
        else{
            System.out.println("null");
        }
    }

    public static boolean checkPassword(String passWord){
        int count = 0;
        if (passWord.length() < 8){
            return false;
        }
        byte[] bytes = passWord.getBytes();
        for (byte b: bytes) {
            if (b>=65||b<=90){
                count++;
            }
        }
        if (count < 2){
            return false;
        }
        char [] chars = passWord.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if ((chars[i]<'0'||chars[i]>'9')&&(chars[i]<'a'||chars[i]>'z')&&(chars[i]<'A'||chars[i]>'Z')){
                return false;
            }
        }
        return true;
    }

}
