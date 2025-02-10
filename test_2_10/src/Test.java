import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //使用循环求斐波那契的 N 项
        int n = 5;
        int a = 0;
        int b = 1;
        int c = -1;

        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println(c);
        }

    }
    public static int fac1(int n) {
        if (n == 1) {
            return 1;
        }
        int ret = n * fac1(n-1);
        return ret;
    }

    public static void print(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        print(n/10);
        System.out.println(n%10);
    }

    public static int addN(int n) {
        if (n ==1) {
            return 1;
        }
        int sum = n + addN(n-1);
        return sum;
    }

    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        int ret = sum(n/10) + (n%10);
        return ret;
    }

    public static int fib(int n) {
        if (n == 1) { // 0 1 1 2 3 5 8 13 21
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main2(String[] args) {
       //递归求n的阶乘
        /*int n = 5;
        int ret = fac1(n);
        System.out.println(ret);*/

        //使用递归打印一个数的每一位
        /*int a = 1234;
        print(a);*/

        //递归求1 加到 10 的和
//        System.out.println(addN(10));

        //写一个递归方法，输入一个非负整数，返回组成它的数字之和.
        //输入
        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = sum(n);
        System.out.println(ret);*/

        //求斐波那契数列的第 N 项

        /*System.out.println(fib(2));
        System.out.println(fib(1));
        System.out.println(fib(9));*/


    }
    public static int fac(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

    public static int facSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }

        return sum;
    }

    public static void main1(String[] args) {
        //阶乘方法
        System.out.println(fac(5));
        System.out.println(fac(6));
        System.out.println(fac(4));

        System.out.println(facSum(5));

    }
}
