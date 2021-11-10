package Day05;

import java.util.Arrays;
import java.util.Random;



public class HomeWork {
    public static void main(String[] args) {
        // 数据初始化
        HomeWorkDemo01 hw1 = new HomeWorkDemo01();
        HomeWorkDemo02 hw2 = new HomeWorkDemo02();
        HomeWorkDemo03 hw3 = new HomeWorkDemo03();
        HomeWorkDemo04 hw4 = new HomeWorkDemo04();
        HomeWorkDemo05 hw5 = new HomeWorkDemo05();
        HomeWorkDemo06 hw6 = new HomeWorkDemo06();
        HomeWorkDemo07 hw7 = new HomeWorkDemo07();

        System.out.println("--------第一题---------------------------");
        int[] rewardArray = hw1.initRewardArray();
        System.out.println("您中奖的大乐透号码为：\n" + Arrays.toString(rewardArray));
        System.out.println("--------第二题---------------------------");
        String[] colorArray = hw2.colorArray();
        String[] numberArray = hw2.numberArray();
        hw2.cardCombine(colorArray, numberArray);
        System.out.println("--------第三题---------------------------");
        String[] cardCombineList = hw2.cardCombineList(colorArray, numberArray);
        hw3.cardPick(cardCombineList);
        System.out.println("--------第四题---------------------------");
        char[] charlist = {'a','b','b','c','d','e','e','f','g','f'};
        HomeWorkDemo04.printCount(charlist);

        System.out.println("--------第五题---------------------------");
        double[] score = {80,90,60,77,99,100};
        double avg = hw5.getAverage(score);
        System.out.println(Arrays.toString(score) + " 的平均分是： " + avg);

        System.out.println("--------第六题---------------------------");
        int[] numArray1 = {1,2,3,4,3,2,1};
        int[] numArray2 = {1,2,3,4,5,2,1};
        int[] num4 = {1,2,2,1};
        int[] num5 = {1,2,3,3,1};

        boolean check1 = hw6.checkSyn(numArray1);
        boolean check2 = hw6.checkSyn(numArray2);
        boolean check3 = hw6.checkSyn(num4);
        boolean check4 = hw6.checkSyn(num5);
        System.out.println(check3 );
        System.out.println(check4);
        System.out.println(Arrays.toString(numArray1) + "是否对称: " + check1);
        System.out.println(Arrays.toString(numArray2) + "是否对称: " + check2);
        


        System.out.println("--------第七题---------------------------");
        int[] num1 = {1,2,3,4,5,6,7};
        
        int[] num2 = {1,2,3,4,5,6,7};
        int[] num3 = {7,6,5,4,3,2,1};
        boolean checkTrue = hw7.equals(num1, num2);
        boolean checkFalse = hw7.equals(num1,num3);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println("是否一致：" + checkTrue);
        System.out.println("=============================");
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num3));
        System.out.println("是否一致：" + checkFalse);

        
    }
    
}

class HomeWorkDemo01{
    public int[] initRewardArray(){
        Random random = new Random();
        int[] rewardArray = new int[10];
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            rewardArray[i] = number;
        }
        return rewardArray;
    }
}

class HomeWorkDemo02{
    /**
     * 
     * @return 扑克牌花色列表
     */
    public String[] colorArray(){
        String[] colorArray = new String[4];
        colorArray[0] = "黑桃";
        colorArray[1] = "红桃";
        colorArray[2] = "梅花";
        colorArray[3] = "方片";

        return colorArray;
    }

    public String[] numberArray(){
        String[] numberArray = new String[13];
        for (int i = 0; i < numberArray.length; i++) {
            // 当 数字为 1或 11 12 13 时通过switch语句输出
            if((i+1)<2 || (i+1)>10){
                switch(i+1){
                    case 1:
                        numberArray[i] = "A";
                        break;
                    case 11:
                        numberArray[i] = "J";
                        break;
                    case 12:
                        numberArray[i] = "Q";
                        break;
                    case 13:
                        numberArray[i] = "K";
                        break;
                }
            }
            else{
                numberArray[i] = String.valueOf(i+1);
            }
        }
        return numberArray;
    }

    public void cardCombine(String[] colorArray, String[] numberArray){
        for (String color : colorArray) {
            for (String number : numberArray) {
                System.out.print(color+number + " ");
            }
            System.out.println(" ");
            
        }
    }

    public String[] cardCombineList(String[] colorArray, String[] numberArray){
        String[] cardCombineList = new String[52];
        int point = 0;
        for (int i = 0; i < colorArray.length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                cardCombineList[point] = colorArray[i] + numberArray[j];
                point++;
            }
            
        }
        return cardCombineList;
    }
}

class HomeWorkDemo03{
    public void cardPick(String[] cardCombineList){
       System.out.println(cardCombineList[0] + " " + cardCombineList[4] + " " + cardCombineList[49]);
    }
}

class HomeWorkDemo04{
   public static void printCount(char[] charlist){
    int[] chars = new int[26];
    for (int i = 0; i < charlist.length; i++) {
        char temp = charlist[i];
        int char_index = temp - 97;
        chars[char_index]++;
    }

    for (int i = 0; i < chars.length; i++) {
        if(chars[i] != 0){
            char c = (char)(97 + i);
            int count = chars[i];
            System.out.println(c + "--->" + count);
        }
    }
   }
}

class HomeWorkDemo05{
    public double getAverage(double[] score){
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return avg = sum/(score.length);
    }
}

class HomeWorkDemo06{
    public boolean checkSyn(int[] numArray1){
        for(int i = 0; i<numArray1.length/2;i++){
            if(numArray1[i] != numArray1[numArray1.length-1-i] ){
                return false;
            }
        }
        return true;
    }
}

class HomeWorkDemo07{
    public boolean equals(int[] numArray1, int[] numArray2){
        boolean check =false;
        if(numArray1.length != numArray2.length){
            System.out.println("数组长度不统一，完全不对称");
        }
        for (int i = 0; i < numArray1.length; i++) {
            if(numArray1[i] == numArray2[i]){
                check = true;
            }else if(numArray1[i] != numArray2[i]){
                check = false;
                break;
            }
        }
        return check;
    }
    
}
