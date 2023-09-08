package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 18:25
 * @Deac:
 */
public class J10_Object_Extends {
    public static void main(String[] args) {
    //    TODO 面向对象--继承
    //    封装、继承、多态
    //    子类可以直接获取到父类的成员属性和成员方法
    //    只能单继承，不能多有父类，
    //    可以有多个子类
        Child child = new Child();
        System.out.println(child.name);
        child.test();
    }
}

class Parent{
    String name  = "lisi";
    void test(){
        System.out.println("test");
    }
}
class Child extends Parent{

}




















