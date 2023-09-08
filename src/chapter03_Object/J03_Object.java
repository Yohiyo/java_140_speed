package chapter03_Object;

/**
 * @Auther: Byhy
 * @Date: 15:09
 * @Deac:
 */
public class J03_Object {
    //    todo 面向对象
    public static void main(String[] args) {

        class Teacher{
            String name;
            void teach(){
                System.out.println(name+"在讲课");
            }
        }

        class Student{
            String name;
            void study(){
                System.out.println(name+"在学习");
            }

        }

        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.name = "王老师";
        student.name = "李同学";

        teacher.teach();
        student.study();

    }
}
