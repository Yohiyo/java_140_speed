package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 15:09
 * @Deac:
 */
public class J02_Object {
    //    todo 面向对象
    public static void main(String[] args) {
        class Dog{
            String name;
            String color;
            void run(){
                System.out.println(color+"的"+name+"跑开了");

            }

        }
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "小黑";
        dog1.color = "黑色";


        dog2.name = "小黄";
        dog2.color = "黄色";

        dog1.run();
        dog2.run();
    }
}
