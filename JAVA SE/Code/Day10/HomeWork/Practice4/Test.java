package Day10.HomeWork.Practice4;

public class Test {
    public static void main(String[] args) {
        Star star1 = new Star();
        star1.shine();
        System.out.println("=================>");
        Universe universe = new Sun();
        universe.doAnything();
        Sun sun = (Sun) universe;
        sun.shine();


        
    }
}
