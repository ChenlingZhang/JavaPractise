package HomeWork;

public class Teacher {
    private String name;
    private int age;
    private String content;
    public Teacher(){}
    public Teacher(String name, int age, String content){
        setName(name);
        setAge(age);
        setContent(content);
    }
    public String eat(){
        return "年龄为" + age + "的" + name +"正在吃饭";
    }
    public String teach(){
        return "年龄为" + age + "的" + name +"正在亢奋的讲着" + content;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getContent(){
        return content;
    }
}
