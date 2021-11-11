package Day11.Practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 3个接待员对象
        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client();
        // 创建50个客户
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            users.add(new User(i,null));
        }
        System.out.println("未分组：");
        System.out.println(users);
        c1.setFilter(new Filter() {
            @Override
            public void filter(User u) {
                if (u.getId()>=10 && u.getId()<=19){
                    u.setUserFilter("V1");
                }
            }
        });
        c2.setFilter(new Filter() {
            @Override
            public void filter(User u) {
                if (u.getId()>=20 && u.getId()<=29){
                    u.setUserFilter("V2");
                }
            }
        });

        for (int i = 0; i < users.size() ; i++) {
            User user = users.get(i);
            c1.setUser(user);
            c2.setUser(user);
            c3.setUser(user);
        }
        System.out.println("已分组:");
        for (int i = 0; i < users.size() ; i++) {
            User u = users.get(i);
            if (i%9 == 0){
                System.out.println();
            }
            System.out.print(u+"");

        }
    }
}
