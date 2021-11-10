package Day09.HomeWork.Practice4;

public class SUV extends Auto{
    private double smallSuvLength = 4295;
    private double midSuvLength = 5070;

    public SUV(String brand, double length, double price){
        super(brand,length,price);
    }
    // 小型车标记为1，中型车标记为2，大型车标记为3
    public static int carKindCheck(Auto auto){
        int mark = 0;
        if (auto.getLength() < 4295){
            mark = 1;
        }
        else if (auto.getLength() >4295 && auto.getLength() <5070){
            mark = 2;
        }
        else if (auto.getLength() > 5070){
            mark = 3;
        }
        return mark;
    }
    public void showInfo(){
        System.out.println("车型：" + super.getBrand());
        System.out.println("   价格：" + super.getPrice());
        System.out.println("   车长：" + super.getLength());
    }

    public double getSmallSuvLength() {
        return smallSuvLength;
    }

    public void setSmallSuvLength(double smallSuvLength) {
        this.smallSuvLength = smallSuvLength;
    }

    public double getMidSuvLength() {
        return midSuvLength;
    }

    public void setMidSuvLength(double midSuvLength) {
        this.midSuvLength = midSuvLength;
    }
}
