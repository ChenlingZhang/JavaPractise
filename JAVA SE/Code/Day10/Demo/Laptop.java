package Day10.Demo;

public class Laptop {
   public void useUSB(USB usb){
       if (usb != null){
           usb.openUSB();
       }
       if (usb instanceof Mouse){
           Mouse mouse = (Mouse) usb;
           mouse.click();
       }else if (usb instanceof KeyBoard){
           KeyBoard keyBoard = (KeyBoard) usb;
           keyBoard.type();
       }
   }

   public void run(){
       System.out.println("笔记本电脑开始运行");
   }
}
