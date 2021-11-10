package Day10.HomeWork.Prictice3;

public interface A {
    void showA();
    private static void show10(String str){
        for (int i = 0; i <10 ; i++) {
            System.out.print(str + " ");
        }
        System.out.println("");
    }
    public static void showB10(){
        show10("BBBB");
    }
    public static void showC10(){
        show10("CCCC");
    }
}
