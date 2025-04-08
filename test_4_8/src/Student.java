public class Student {
    private String name;
    private String sex;
    private int age;
    private static String classRoom;
    private static String school;

    //静态代码块
    static {
        classRoom = "406";
        school = "xxx school";
        System.out.println("静态代码块被执行");
    }

    //实例代码块
    {
        sex = "female";
        age = 20;

        System.out.println("实例代码块1，被执行");
    }

    {
        System.out.println("实例代码块2，被执行");
    }

    //构造方法
    public Student() {
        this.name = "zhangsan";
        System.out.println("构造方法被执行");
    }
}
