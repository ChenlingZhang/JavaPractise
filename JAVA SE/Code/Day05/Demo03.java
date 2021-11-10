package Day05;

import java.util.Arrays;

/**
 * 参数传递：
 *  引用类型和基本类型参数区别
 *  Java中的参数传递全都是值的传递
 *  引用类型变量保存的是一段哈希值，简单认为是内存的首地址 
 * CPU只用于计算，数据寸尺在硬盘【访问速度慢】，内存（包括高速缓存中）【访问速度高】
 * 计算机在运行过程中，数据都是保存在内存中
 * 
 * 引用类型数据是保存在堆内存上，可以通过内存首地址访问堆上的数据 
 *  如果把堆内存假设成房子，内存首地址相当于门牌号，可以通过门牌号访问具体一间房子 
 *  1、main/updateReferenceType方法中，引用类型变量保存的都是内存首地址
 *  2、方法中的变量保存在栈上，引用类型的数据是保存在堆内存上
 *  3、栈内存：
 *      1.在方法运行前初始化栈空间，声明了变量就分配给变量内存空间 
 *      2.如果变量是基本类型，变量中保存的是值
 *      3.如果变量是引用类型，变量中保存的是内存首地址 
 *      4.方法执行完毕之后，栈空间立即销毁，栈内存中清空数据，以便为下一个方法腾空间
 *  4. 堆内存：
 *      1. Java程序运行期间，堆内存一直存在
 *      2、在Java程序运行期间，new创建的数据都会分配在堆内存上，产生内存首地址。
 *      3、如果又变量引用这个堆上的数据，会把内存首地址赋值给这个变量。
 *      4. Java程序运行结束之后，堆内存才会销毁
 *      5. 堆内存在程序运行期间受到JVM控制，进行内存回收
 * 
 * 引用类型传递的依旧是值，不过是内存首地址值
 *  */
public class Demo03 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println("main方法中，array1：" + array1);
        System.out.println(Arrays.toString(array1));
        updateReferenceType(array1);
        System.out.println(Arrays.toString(array1));
    }

    public static void updateReferenceType(int[] array){
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        System.out.println("在updateReferenceType方法内部的array值为: " + array);
    }
    
}
