import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //猜数字游戏
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //生成随机数
        int randNum = random.nextInt(101);

        while (true) {
            System.out.println("请输入数字:");
            int guessNum = scan.nextInt();

            if (guessNum > randNum) {
                System.out.println("猜大了");
            } else if (guessNum == randNum) {
                System.out.println("猜对了！！！");
                break;
            } else {
                System.out.println("猜小了");
            }
        }

        scan.close();


        //判断一个数是否为素数

        Scanner scan = new Scanner(System.in);
        int flag = 1;
        //输入

        System.out.println("请输入一个数字");
        int num = scan.nextInt();

        //判断
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("不是素数");
                flag = 0;
                break;
            }

        }

        if (flag == 1) {
            System.out.println("素数");
        }

        scan.close();


        //找出100 到 200 之间的素数

        //偶数一定不是素数，所以每次加2
        for (int i = 101; i <= 200; i+=2) {
            int  flag = 1;
            for (int n = 2; n <= Math.sqrt(i); n++) {
                if (i % n == 0) {
                    //不是素数
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) {
                System.out.println(i);
            }
        }

        //乘法口诀表

        for (int i = 1; i <= 9; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.printf("%d * %d = %d\t", n, i, n*i);
            }
            System.out.println();
        }



        }
    }
}
