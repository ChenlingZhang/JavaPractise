package Day09.HomeWork.Practice3;

public class Teacher extends Person{
    private String subject;
    public Teacher(){};
    public Teacher(String name, int age, String subject){
        super(name,age);
        this.subject = subject;
    }
    @Override
    public void showMsg(){
        System.out.println(super.getName() + " 老师" + ",讲授"+this.subject+"课");
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
}
