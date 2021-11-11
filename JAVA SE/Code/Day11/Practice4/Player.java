package Day11.Practice4;

public class Player {
    public FightAble select(String str){
        FightAble roleKind = null;
        if (str.equals("法师")){
            System.out.println("选择：法力角色");
            roleKind = new Mage();

        }else if (str.equals("战士")){
            System.out.println("选择：武力角色");
            roleKind = new Solider();

        }
        return roleKind;
    }
}
