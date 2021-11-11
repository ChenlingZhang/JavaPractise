package Day11.Practice4;

public class Test {
    public static void main(String[] args) {
        Player p1 = new Player();
        FightAble f1 = p1.select("法师");
        f1.specialFight();
        f1.commonFight();
        System.out.println("=======");
        Player p2 = new Player();
        FightAble f2 = p2.select("战士");
        f2.specialFight();
        f2.commonFight();
    }
}
