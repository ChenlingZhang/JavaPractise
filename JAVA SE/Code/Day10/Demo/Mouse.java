package Day10.Demo;

public class Mouse implements USB{
    @Override
    public void openUSB() {
        System.out.println("鼠标闪烁");
    }

    @Override
    public void closeUSB() {
        System.out.println("USB链接断开，鼠标灯光关闭");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
