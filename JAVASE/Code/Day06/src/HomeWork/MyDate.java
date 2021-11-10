package HomeWork;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(){}
    public MyDate(int year, int month, int day){
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public String isBi(int year){
        if (year%4 == 0){
            return year+"是闰年";
        }
        else
            return year+"不是闰年";

    }

    public String toString(){
        return "日期：" + year + "年" + month + "月" + day + "日" + "\n"+ isBi(year);
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
}
