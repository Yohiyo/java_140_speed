package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 18:25
 * @Deac:
 */
public class J10_Object_Extends_2 {
    public static void main(String[] args) {
    //    TODO 面向对象--继承--构造方法
    //
        Child2 child1 = new Child2();
        Child2 child2 = new Child2();
        Child2 child3 = new Child2();

    /*parent2....
    child2,,,,
    parent2....
    child2,,,,
    parent2....
    child2,,,,
    父类对象是在子类对象创建前创建完成，创建子类对象前，会调用父类的构造方法完成创建*/
    }
}
class Parent2{
    //构造方法也是方法，传参的目的就是为了给属性赋值
    String username;
    Parent2(String name){
        username = name;
        System.out.println("parent2....");
    }
}
class Child2 extends Parent2{
//    构造方法
    Child2(){
        //默认情况下，子类对象创建时，会默认调用父类的构造法完成父类对象创建，使用的是super方式。
        //如果父类提供了构造方法，nameJVM不会提供默认的构造方法，那么子类就必须调用super构建父类对象
        super("wangwu");
        System.out.println("child2,,,,");
    }
}

//new 构建一个！对象，在内存中只会开辟一个内存空间。




















