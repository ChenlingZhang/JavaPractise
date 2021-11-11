package Day11.Practice2;

public class Teacher {
    private String name;
    public Teacher(){};
    public Teacher(String name){
        setName(name);
    }

    public void checkAttendence(Student student){
        if (student.getName().equals("小明")){
            student.setAttendence("旷课");
        }
        else{
            student.setAttendence("上课");
        }
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
