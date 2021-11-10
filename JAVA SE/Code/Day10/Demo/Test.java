package Day10.Demo;

public class Test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        USB mouseUSB = new Mouse();
        USB keyBoardUSB = new KeyBoard();
        laptop.run();
        laptop.useUSB(mouseUSB);
        laptop.useUSB(keyBoardUSB);
    }
}
