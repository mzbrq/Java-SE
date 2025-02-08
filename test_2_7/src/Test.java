import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //输出整数的每一位

        //输入
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = scan.nextInt();

        //计算
        int count = 0;

        while (num1 != 0) {
            //输出
            System.out.println(num1 % 10);
            num1 /= 10;
        }

        scan.close();
    }
    public static void main5(String[] args) {
        //计算分数的值

        //奇数之和减偶数之和
        float num1 = 0.0f;
        float num2 = 0.0f;

        for (float i = 1f; i <= 100; i++) {

            //偶数
            if (i % 2 == 0) {
                num2 += 1 / i;
            } else {
                num2 += 1 / i;
            }
        }

        //求值
        float sum = num1 - num2;
        System.out.println(sum);
    }
    public static void main4(String[] args) {
        //求 1~100 出现多少个数字9
        // 9 19 29 39 49 59 69 79 89 91 92 93 94 95 96 97 98 99 = 19个
        int count = 0;

        for (int i = 0; i <= 100; i++) {

            //个位数为9
            if (i % 10 == 9) {
                count++;
            }
            //十位数为9
            if (i / 10 == 9) {
               if (i % 10 != 9) {
                   count++;
               }
            }

        }

        //输出
        System.out.println(count);
    }
    public static void main3(String[] args) {
        //求两个正整数的最大公约数

        //1.输入
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个正整数");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("有不为正整数的数");
        } else {
            //2.计算

            //先判断那个数小
            int max = a;
            int min = b;

            if (a < b) {
                max = b;
                min = a;
            }

            //算最大公约数
            for (int i = min; i > 0; i--) {
                if ((a % i == 0) && (b % i == 0)) {
                    //3.输出
                    System.out.println("最大公约数：" + i);
                    break;
                }
            }

            scan.close();
        }

    }
    public static void main2(String[] args) {
        //算一个数二进制中 1 的个数

        //输入
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = scan.nextInt();

        //运算
        int count = 0;

        while (num != 0) {
            //每次逻辑与num-1,然后赋值给num,二进制中会减少一个1，直到num为0
            num &= (num-1);
            count++;
        }
        //输出
        System.out.println("二进制中1的个数为：" + count);

        scan.close();
    }
    public static void main1(String[] args) {
        //0~99999水仙花数

        for (int i = 0; i < 999999; i++) {
            //判断这个数是几位数
            int tmp = i;
            int count = 0;

            while (tmp != 0) {
                tmp /= 10;
                count++;
            }

            tmp = i;

            if (count == 1) {
                System.out.println(i);
            } else {
                int sum = 0;

                while (tmp != 0) {
                    sum += Math.pow(tmp%10, count);
                    tmp /= 10;
                }

                if (i == sum) {
                    System.out.println(i);
                }
            }


        }

    }
}
