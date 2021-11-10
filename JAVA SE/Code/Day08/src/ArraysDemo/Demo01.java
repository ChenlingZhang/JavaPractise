package ArraysDemo;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        // Arrays toString 方法演示
        int[] numArray = {1,2,3,4,5,6,7};
        System.out.println(numArray); // -->此处会打印一个内存地址
        System.out.println(Arrays.toString(numArray)); // --> 此处以字符串的形式打印数组中的值

        // Arrays sort 方法演示
        int[] number = {7,8,4,5,1,3};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number, 1));

    }
}
