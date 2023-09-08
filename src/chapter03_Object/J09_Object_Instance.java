package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 18:00
 * @Deac:
 */
public class J09_Object_Instance {
    public static void main(String[] args) {
    //    todo 面向对象---构建对象
    //    构造方法：专门用于构建对象
    //    如果一个类中没有任何的构造方法，那么JVM会自动添加一个公共的、无参的构造方法
    //    TODO：构造对象： 类名(){}
    //    1、构造方法也是方法，但是没有void()关键字
    //    2、方法名和类名完全相同
    //    3、如果类中没有构造方法,那么JVM会提供默认的公共无参构造方法
    //    4、如果类中有构造方法,那么JVM不会提供默认的公共无参构造方法
    //    5、构造方法也是方法，所以也可以传递参数，但是一般传递参数的目的是用于对象属性的赋值
        User09 user09 = new User09("lisi");  //括号是方法的意思
        user09.test();
        System.out.println(user09.username);

    //代码块：在构造对象之前执行


    }
}
class User09{
    String username;

    //构造方法
    User09(String name ){
        username = name;
        System.out.println("运行了User09");
    //    在new的时候调用
    }


    void test(){
        System.out.println("test.....");
    }
}