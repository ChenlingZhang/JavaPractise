package Day10.HomeWork.Practice4;

public class Sun extends Star implements Universe{
    @Override
    public void shine() {
        System.out.println("sun: 光照把分钟到达地球");
    }

    @Override
    public void doAnything() {
        System.out.println("sun: 太阳吸引着9大行星旋转");
    }
}
