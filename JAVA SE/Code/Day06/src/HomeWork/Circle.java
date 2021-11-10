package HomeWork;

import java.text.DecimalFormat;

public class Circle {
    private double radius;
    public Circle(){}
    DecimalFormat df = new DecimalFormat("#.00");

    public Circle(double radius){
        setRadius(radius);
    }

    public double showPerimeter(){
        return radius*2*Math.PI;
    }

    public double showArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    public String toString(){
        return "半径为：" + radius + " " + " 面积为：" + df.format(showArea()) + " 周长为：" + df.format(showPerimeter());
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
