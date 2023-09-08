package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 15:09
 */
public class J05_Method_Param {
    public static void main(String[] args) {
    //TODO 面向对象--方法参数
        UserMP userMP = new UserMP();
        String name = "李斯";
        int age = 18;
        //传递参数
        userMP.sayHello(name,age);

    //    当传递参数为多个时，需要注意
    //    1、参数个数、类型、顺序要匹配

        userMP.test("张三","李斯","王五","赵璐");



    }
}
class UserMP{
    void sayHello(String name,int age){
        //使用参数
        System.out.println("Hello！"+age+"岁的"+name);
    }

    //    当参数个数不确定时，但是类型相同时，可以采用特殊的参数语法声明——可变参数
    //    不常用
    //      如果参数中还包括其他含义的参数，那么可变参数应该放最后
    //    语法：参数类型...参数名称
    void test(String...name){
        //name可变参数是数组，需要循环取值打印
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

    }
}
