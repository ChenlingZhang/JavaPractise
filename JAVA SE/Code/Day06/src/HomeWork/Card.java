package HomeWork;

public class Card {
    private String color;
    private String point;
    public Card(String color, String point){
        setColor(color);
        setPoint(point);
    }
    public void  showCard(){
        if (color == null){
            System.out.println("ball ball u 看看花色吧");
        }
        else {
            System.out.println(color + point);
        }
    }

    public void setColor(String color){
        if (color == "红桃"|| color == "黑桃" || color=="方块" || color=="梅花"){
            this.color = color;
        }
        else {
            System.out.println("扑克牌里真的有" + color + "这个花色吗蠢逼");
        }
    }
    public String getColor(){
        return color;
    }
    public void setPoint(String point){
        this.point = point;
    }
    public String getPoint(){
        return point;
    }
}
