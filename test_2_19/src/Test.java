//定义一个对象为狗的类
class Dogs {
    //成员属性
    public int age;
    public String color;
    public String name;

    //成员方法
    public void barks() {
        System.out.println(name + "汪~");
    }

    public void wag() {
        System.out.println(name + "摇尾巴~");
    }

}
//定义一个学生类
class Student {
    //成员属性
    public int age;
    public String sex;
    public String name;

    //成员方法
    public void DoHomework() {
        System.out.println("做作业");
    }
    public void Exam() {
        System.out.println("考试");
    }
}
//定义一个日期类
class Date {
    //成员属性
    public int year;
    public int month;
    public int day;

    //成员方法

    //

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    //构造方法:用来初始化对象
    public Date() {
        this(6666, 6, 6);
        System.out.println("重载了");
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void SetDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void PrintDate() {
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
public class Test {
    public static void main(String[] args) {
        //实例化对象
        Dogs d1 = new Dogs();

        //通过 . 访问对象属性
        d1.age = 3;
        d1.name = "hh";
        d1.color = "pink";

        //访问成员方法
        d1.barks();
        d1.wag();

        System.out.println("==================");

        //实例化学生对象
        Student stu = new Student();

        // 通过 . 访问实例化对象
        stu.age = 18;
        stu.name = "sb";
        stu.sex = "female";

        //访问成员方法
        stu.DoHomework();
        stu.Exam();

        System.out.println("==================");

        //示例化Date对象
        Date date1 = new Date();

        /*date.year = 2008;
        date.month = 8;
        date.day = 8;*/

//        date1.SetDate(2008, 8, 8);
        date1.PrintDate();
       // date1.PrintDate();

        Date date2 = new Date(1111, 11, 11);
        date2.PrintDate();

        //对象的打印
        System.out.println(date2);// 源码中会调用toString()

    }
}
