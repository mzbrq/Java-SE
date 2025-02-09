import java.util.Scanner;

public class Test {
    public static int add(int a, int b) {
        return a+b;
    }
    public static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //输入
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int ret = add(a, b);
        System.out.println(ret);

       /*if (isLeapYear(2003)) {
           System.out.println("闰年");
       } else {
           System.out.println("不是闰年");
       }*/
    }
    public static void main6(String[] args) {
        //求两个正整数的最大公约数(辗转相除法)

        //输入
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个正整数");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a % b;

        if (a*b <= 0) {
            System.out.println("其中有不为正整数的数");
        } else {
            //计算
            while (c != 0) {
                a = b;
                b = c;
                c = a % b;
            }

            //输出
            System.out.println("最大公约数：" + b);
        }


        scan.close();
    }
    public static void main5(String[] args) {
        //分别获取一个二进制序列的奇数位和偶数位

        //输入 // 7 = 0111
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 30; i >= 0; i-=2) {
            System.out.print((n >> i) & 1);
        }
        System.out.println();
        for (int j = 31; j >= 0; j-=2) {
            System.out.print((n >> j) & 1);
        }

        scan.close();
    }
    public static void main4(String[] args) {
        //三次登录
        Scanner scan = new Scanner(System.in);
        int count = 3;

        while (count != 0) {
            //输入
            System.out.println("请输入密码");
            String password = scan.nextLine();

            if (password.equals("123456")) {
                System.out.println("密码正确，登录成功");
                break;
            } else {
                if (count == 1) {
                    System.out.println("登录失败,机会已用完");
                } else {
                    System.out.println("密码错误。你还有" + (count-1) + "次机会");
                }
                count--;
            }
        }

        scan.close();
    }
    public static void main3(String[] args) {
        //求分数的值
        double sum = 0.0;
        int flag = 1;

        for (int i = 1; i <= 100; i++) {
            sum += 1.0/i*flag;
            flag = -flag;
        }

        System.out.println(sum);
    }
    public static void main2(String[] args) {
        //打印 x 图案

        //输入
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();

        //打印
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if (i == j || i+j == line-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        scan.close();
    }
    public static void main1(String[] args) {
        //分别获取一个二进制序列的奇数位和偶数位

       /* //输入
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        //计算
        String a = "";
        for (int i = 0; i < 32; i+=2) {
            a += (num >> i) % 2;
        }



        //输出

        scan.close();*/
    }
}
