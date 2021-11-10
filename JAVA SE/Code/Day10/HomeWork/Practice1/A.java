package Day10.HomeWork.Practice1;

public interface A {
    void showA();
    public default void showB(){
        System.out.println("BBBB");
    }
}
