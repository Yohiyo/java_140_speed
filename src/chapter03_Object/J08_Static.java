package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 0:00
 * @Deac:
 */
public class J08_Static {
    public static void main(String[] args) {

        Chinese c = new Chinese();
        //Chinese c = null;
        c.name = "lisi";

        System.out.println("Hello"+ c.name +","+ c.nationality);
        System.out.println("Hello"+ c);  //Hellochapter03_Object.Chinese@59f95c5d

        Bird.fly();
        System.out.println(Bird.name);
    }
}
class Chinese{
    String name;

    String nationality = "中国";
}


class Bird{
    static String name = "雪鸮";
    static void fly(){
        System.out.println("。。。在飞");
    }
}
