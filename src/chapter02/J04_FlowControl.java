package chapter02;

/**
 * @Auther: Byhy
 * @Date: 15:46
 * @Deac:
 */
public class J04_FlowControl {
    public static void main(String[] args) {

        //流程控制
        /*if ( i == 10){
            System.out.println();
        }else if (i ==20){
            System.out.println();
        }else if (i ==30){
            System.out.println();
        }else {
            System.out.println();
        }*/
        /*int i = 30;
        switch (i){
            case 10:  //判断是否是10
                System.out.println("1");
            case 20:
                System.out.println("2");
            case 30:
                System.out.println("3");
                break;
            case 40:
                System.out.println("4");
            default:
                System.out.println("必须执行");
        }*/
        /*int age = 30;
        while (age <= 40){
            System.out.println("age是："+age);
            age++;
        }*/
        /*int age = 10;
        //即使不成立，也会至少执行一次
        do{
            age ++;
            System.out.println("age是："+age);
        }while (age < 20);*/

        /*int age = 20;
        for (int i =0; age < 30; i++){
            System.out.println("age是："+age);
        }*/
        int level = 3;
        for (int j = 0; j < level; j++) {
            //控制行数
            for (int i = 0; i < (level - 1) - j; i++) {
                System.out.print(" ");
            }
            //控制*的个数
            for (int i = 0; i < j * 2 + 1; i++ ){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
