public class Test {
    public static void main(String[] args) {
       Data data1 = new Data(2025, 4, 3);
       data1.printData();
    }
    public static void main1(String[] args) {
        Dog d1 = new Dog(); //实例化一个狗的对象
        //通过 成员名.类的成员 进行访问
        d1.dogName = "旺财";
        d1.age = 4;
        System.out.println(d1.dogName);
        System.out.println(d1.age);

        d1.bark();
        d1.wagTail();
    }
}
//狗类
class Dog {
    //成员变量：用来描述狗的一些属性
    String dogName; //修狗的名字
    double weight; // 修狗的体重
    int age;

    //成员方法：用来描述狗的一些行为功能

    //行为：叫
    void bark() {
        System.out.println(dogName + "汪汪叫");
    }

    //行为：摇尾巴
    void wagTail() {
        System.out.println(dogName + "摇尾巴");
    }

}

//日期类
class Data {
    int year;
    int mouth;
    int day;

    public Data(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
        System.out.println("构造方法被调用");
    }

    //打印日期
    void printData() {
        System.out.println("year: " + year + " mouth: " + mouth + " day: " + day);
    }

    //设置日期
    void setData(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }
}




