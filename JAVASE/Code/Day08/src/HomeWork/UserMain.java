package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = in.nextLine();
        System.out.println("请输入密码");
        String password = in.nextLine();
        User user = new User(username,password);
        String loginMessage = login(user);
        System.out.println(loginMessage);

    }

    public static String login(User user){
        String message="登录成功";
        User user1 = new User("timmy","123456");
        User user2 = new User("James","abide");
        User user3 = new User("Tom","Jerry");
        ArrayList<User>users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        for (User u: users) {
            if ((!u.getName().equals( user.getName())&&u.getPassword().equals(user.getPassword()))&&(!u.getName().equals( user.getName())&&!u.getPassword().equals(user.getPassword()))){
                message = "不存在用户";
            }
            else if (u.getName().equals( user.getName())&&!u.getPassword().equals(user.getPassword())){
                message = "密码错误";
            }
        }
        return message;
    }


}
