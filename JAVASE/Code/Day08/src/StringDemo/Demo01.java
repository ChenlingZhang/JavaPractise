package StringDemo;

import java.util.Arrays;

/**
 * 这个类用于演示String类中的一些常用用法
 */
public class Demo01 {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLo";
        // public boolean equals(Object anObject):将此字符串与指定对象进行比较
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        // public boolean equalsIgnroeCase(String anotherString): 将此字符串与指定字符串进行比较
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("===============================================>");

        // public int length(): 获取字符串的长度
        System.out.println(s1.length()); // --> 5
        System.out.println(s2.length()); // --> 5
        System.out.println(s3.length()); // --> 5
        // public String concat(String str): 将指定字符串拼接到该字符串的末尾
        String s1ConcatS3 = s1.concat(s3);
        System.out.println(s1ConcatS3); //helloHello
        System.out.println(s1.concat("world")); // helloworld
        // public char charAt（String index): 返回指定索引出的char值
        System.out.println(s1.charAt(0));// --> h
        System.out.println(s1.charAt(1));// --> e
        System.out.println(s1.charAt(2));// --> l
        System.out.println(s1.charAt(3));// --> l
        System.out.println(s1.charAt(4));// --> o
        // public int indexOf(String str):返回一个指定字符串第一次出现再字符串中的索引
        System.out.println(s1.indexOf("h"));//-->0
        System.out.println(s1.indexOf("e"));//-->1
        System.out.println(s1.indexOf("l"));//-->2
        System.out.println(s1.indexOf("l"));//-->3
        System.out.println(s1.indexOf("o"));//-->4
        // public String subString（int beginIndex): 返回一个字符串，从beginIdex开始截取到字符串结尾
        System.out.println(s1.substring(1)); // ello
        // public String subString(int beginIndex, int endIndex): 返回一个字符串，从beginIdex到endIndex截取字符串，含beginIndex不包含endIndex
        System.out.println(s1.substring(1,3)); // el

        System.out.println("=============================================>");
        // public char[] toCharArray():将此字符串转换为新的字符数组
        char[] chars = s1.toCharArray();
        System.out.println(Arrays.toString(chars)); //[h, e, l, l, o]
        // public byte[] getBytes(): 使用平台默认字符集将该String编码转换为新的字节数组
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes)); //[104, 101, 108, 108, 111]
        // public String replace（CharSequence target， CharSequence replacement）：将与target匹配的字符串使用replacement字符串替换
        System.out.println(s1.replace('h','w')); // wello
        System.out.println("=============================================>");
        // public String[] split(String regex) ： 根据规则拆分字符串数组
        String strBeforeSplit = "aa bb cc";
        String[] strings = strBeforeSplit.split(" ");
        System.out.println(Arrays.toString(strings)); //[aa, bb, cc]
    }
}
