import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //break 语句

        //打印 100 到 200 之间第一个三的倍数

        int i = 100;

        while (i <= 200) {
            if (i % 3 == 0) {
                System.out.println("第一个三的倍数是" + i);
                break;
            }
            i++;
        }

        //打印 100 到 200 之间所有的3的倍数

        int i = 100;

        while (i <= 200) {
            if (i % 3 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


        //100 到 200 及能被3整除，也能被4整除的数字

       int i = 100;

       while (i <= 200) {
           if (i % 12 != 0) {
               i++;
               continue;
           }

           System.out.println(i);
           i++;
       }

        //for循环

        //打印1 到 10 数字之和
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        //计算5的阶乘
        int ret = 1;

        for (int i = 1; i <= 5; i++) {
            ret *= i;
        }

        System.out.println(ret);


        //计算1! + 2! + 3! + 4! + 5！

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            int ret = 1;
            for (int n = 1; n <= i; n++) {
                ret *= n;
            }

            sum += ret;
        }

        System.out.println(sum);

        //输入输出

        //监盘上输入

       Scanner scan = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name  = scan.nextLine();
        System.out.println("名字：" + name);


        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = scan.nextInt();
        System.out.println("年龄：" + age);


        //循环输入n个数字，并求平均值

        Scanner scan = new Scanner(System.in);
        int num = 0;
        int n = 0;

        while (scan.hasNextInt()) {
            int tmp = scan.nextInt();
            n++;
            num += tmp;
        }

        //求平均值
        int avg = num / n;

        System.out.println("平均值为：" + avg);


    }
}
