public class Test {
    //方法的定义
   /* 修饰词 返回值类型 方法名(参数类型 形参名，参数类型 形参名...) {
        //方法体代码
        return 返回值;
    }*/
    public static void max(int x, int y) {
        if (x > y) {
            System.out.println(">");
        } else if (x == y) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }

    public static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }



    public static void modify(int n) {
        n = 99;
        System.out.println(n);

    }

    public static int add(int x, int y) {
        return x + y; //直接返回相加结果
    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {

        int ret = add(1, 2, 3);
        double ret1 = add(2, 3,4);

        System.out.println(ret);
        System.out.println(ret1);
    }
    public static void main5(String[] args) {
        //两个整形相加
        int a = 1;
        int b = 3;

        System.out.println(add(a, b)); // 打印4

        //两个小数相加
        double c = 9.0;
        double d = 10.0;

//        System.out.println(addDouble(c, d)); // 打印 19.0

    }
    public static void main4(String[] args) {
        //改变值
        int a = 100;
        modify(a);
        System.out.println(a);

    }
    public static void main3(String[] args) {
        //计算两个整数相加

        System.out.println(add(10, 90)); //直接打印方法返回值

    }

    public static void main2(String[] args) {
        //判断一年是否为闰年
        boolean flag = isLeapYear(2004);

        if (flag == true) {
            System.out.println("闰年");
        } else {
            System.out.println("不是闰年");
        }

    }
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;

        max(a, b);

        int c = 20;
        int d = 33;

        max(c, d);
    }
}
