package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 15:09
 * @Deac:
 */
public class J01_Object {
    //    todo 面向对象
    public static void main(String[] args) {
        //  类：动物
        //    对象：猫狗
        class Animal {
            String type;
            String name;
            void run(){
                System.out.println(name+type+"跑开了");
            }

        }
        Animal a1 = new Animal();
        a1.type = "猫";
        a1.name = "小花";

        Animal a2 = new Animal();
        a2.type = "狗";
        a2.name = "小黑";

        a1.run();
        a2.run();


    }
}
