public class Test {
    public static void main(String[] args) {
        /*//实例化时，调用不带参数的构造方法
        Data data1 = new Data();
        data1.printData();
        System.out.println("======================");

        //实例化时，调用带三个参数的构造方法
        Data data2 = new Data(1949, 10, 1);
        data2.printData();*/

      /*  //只显性定义带三个参数的构造方法
        Data data3 = new Data();
        data3.printData();*/

        //this()在构造方法中调用其他构造方法
        /*Data data4 = new Data();
        data4.printData();*/

        //就地初始化成员变量
        Data data5 = new Data();
        data5.printData();

    }
}

class Data {
    //就地初始化
    int year = 2025;
    int month = 4;
    int day = 5;

    //不带参数的构造方法,在构造方法中调用其他构造方法
    Data() {
        /*this.year = 2025;
        this.month = 4;
        this.day = 5;
        System.out.println("调用不带参数的构造方法");*/
/*
        this(2004, 8 ,24);
        System.out.println("调用不带参数的构造方法");*/
    }

    //带三个参数的构造方法
    Data(int year, int month, int day) {
        /*this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("调用带三个参数的构造方法");*/
        this();
    }

    void printData() {
        System.out.println("year :" + year + " month: " + month + " day: " + day);
    }
}
