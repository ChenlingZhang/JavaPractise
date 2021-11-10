package Day09.HomeWork.Practice3;

public class Student extends Person {
    private double score;
    public Student(){}
    public Student(String name, int age, double score){
        super(name,age);
        this.score = score;
    }

    @Override
    public void showMsg() {
        System.out.println(super.getName() + " 同学，考试得了： " + this.score);
    }

    public void setScore(double score){
        this.score = score;
    }
    public double getScore(){
        return score;
    }
}
