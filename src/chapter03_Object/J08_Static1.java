package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 0:00
 * @Deac:  静态代码块
 */
public class J08_Static1 {
    public static void main(String[] args) {

    //    先有类 再有对象
        Test t = new Test();
        t.test1();
        //t.sex="nan";
        //t.test2();

        Test.test2();   //通过类直接调用静态代码块
    }
}

class Test{

    String name;
    static String sex;

    void test1(){
        //通过test2调用test1
        test2();
    }

    static void test2(){
        System.out.println("test2");
    }
}

class Bird1{
    static String type;
}
