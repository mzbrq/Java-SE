import java.util.Date; //导入包中单个类
import java.util.*; // 导入包中所有类（不包括子包）
import static java.lang.Math.PI; //导入常量
import static java.lang.Math.sqrt; //导入方法


public class Test {
    public static void main(String[] args) {

        //使用import static 导入 静态成员
        System.out.println(PI);
        System.out.println(sqrt(64));
        //使用 import 导入指定包中类
        /*Date date = new Date();
        System.out.println(date);*/

//        Student stu1 = new Student();

        //使用setter 方法设置 成员属性的值
       /* stu1.setName("xiaoming");
        stu1.setAge(18);

        //使用getter 方法拿到 成员属性的值
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());*/

        //手动导入毫秒级时间戳
        /*java.util.Date date = new java.util.Date();
        System.out.println(date);*/

    }
}
