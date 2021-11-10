package Day09.HomeWork.Practice3;

public abstract class Person {
    private String name;
    private int age;

    public Person(){};
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void showMsg();

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
