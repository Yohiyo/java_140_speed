package chapter03_Object;

public class J06_Method_TransformParam {
    //TODO 面向对象--传递方法参数
    public static void main(String[] args) {
        String s = "abc";
        //int j = 10;
        test(s);
        System.out.println(s);  //abc
    }
    /*public static void test(int j) {
        j=j+3;
        //方法test(j)执行后，j=13，同时方法执行后进行了弹栈，j=13被弹出了，j依然是10
    }*/

    public static void test(String s) {
        s = s + 20;
    // 同理 执行完后弹栈，s依旧是指向abc,
    //    切换到执行主方法的时候，方法已经被执行完被弹栈，就只剩主方法的原来的值
    }



}
