package Day10.HomeWork.Practice2;

public interface A {
    void showA();
    private void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str + " ");
        }
        System.out.println("");
    }
    public default void showB10(){
        show10("BBBB");
    }
    public default void showC10(){
        show10("CCCC");
    }
}
