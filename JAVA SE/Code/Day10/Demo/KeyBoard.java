package Day10.Demo;

public class KeyBoard implements USB{
    @Override
    public void openUSB() {
        System.out.println("键盘灯闪烁");
    }

    @Override
    public void closeUSB() {
        System.out.println("USB链接断开，键盘灯光关闭");
    }

    public void type(){
        System.out.println("键盘打字");
    }
}
