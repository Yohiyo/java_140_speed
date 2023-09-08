package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 15:09
 */
public class J04_Method {
    public static void main(String[] args) {
        User user = new User();
        boolean registerResult = user.register();
        if (registerResult) {
            System.out.println("注册成功");
            boolean loginResult = user.login();
            if (loginResult) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }
        }else{
            System.out.println("注册失败");
        }
    }
}
class User{
    String account;
    String password;

    boolean register(){
        System.out.println("用户开始注册");
        return true;
    }

    boolean login(){
        System.out.println("用户开始登录");
        return true;
    }
}
