package Day11.Practice4;

public interface FightAble {
    public abstract void specialFight();
    default void commonFight(){
        System.out.println("普通打击");
    }
}
