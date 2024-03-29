package Day09.HomeWork.Practice2;

public abstract class Poultry {
    private String name;
    private String symptom;
    private int age;
    private String illness;

    public Poultry(){
    }
    public Poultry(String name, String symptom, int age, String illness){
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }
    public void showMsg(){
        System.out.println("动物种类： " + name);
        System.out.println("年龄：" + age);
        System.out.println("入院原因：" + illness);
    }
    public abstract void showSymptom();

    public void setName(String name){
        this.name = name;
    }
    public void setSymptom(String symptom){
        this.symptom = symptom;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setIllness(String illness){
        this.illness = illness;
    }
    public String getName(){
        return name;
    }
    public String getSymptom(){
        return symptom;
    }
    public int getAge(){
        return age;
    }
    public String getIllness(){
        return illness;
    }
}
