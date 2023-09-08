package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 18:25
 * @Deac:
 */
public class J10_Object_Extends_1 {
    public static void main(String[] args) {
    //    TODO 面向对象--继承
        Child1 child = new Child1();
        //System.out.println(child.name);
    //    子类自力更生。
        child.test();
    //    如果父类和子类含有相同的属性，用super和this进行区分
    }
}
class Parent1{
    String name = "zhangsan";

}

class Child1 extends Parent1 {
    String name = "lisi";
    void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    //    默认情况下是不写this的，也就是默认情况下子类自力更生
    //    this和super都属于对象，
        //    而因为静态属于类，不属于对象，所以在静态方法和静态代码块中是不能使用的
    }
}





















