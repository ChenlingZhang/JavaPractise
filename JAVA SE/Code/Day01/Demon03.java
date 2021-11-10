package Day01;

public class Demon03 {
    public static void main(String [] args){
        // 三元表达式 
        // 案例1：如果学生成绩在80分以上，则办法奖品，否则没有奖品
        double score = 60/*  */;

        String result = score >=80?"颁发奖品":"没有奖品";
        System.out.println(result);

    }
}
