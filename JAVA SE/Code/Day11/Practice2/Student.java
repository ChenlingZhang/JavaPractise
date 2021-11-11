package Day11.Practice2;

public class Student {
    private String name;
    private String attendence;
    public Student(){};
    public Student(String name, String attendence){
        setName(name);
        setAttendence(attendence);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAttendence(String attendence){
        this.attendence = attendence;
    }
    public String getName(){
        return name;
    }
    public String getAttendence(){
        return attendence;
    }
}
