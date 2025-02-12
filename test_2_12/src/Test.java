import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //拷贝数组
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = Arrays.copyOf(array1, array1.length);
        int[] array3 = new int[array2.length];
        System.arraycopy(array2, 0, array3, 0, array2.length);

        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }
    public static void main3(String[] args) {
        //数组转字符串
        /*int [] array = {1, 2, 3, 4, 5};
        String s = Arrays.toString(array);
        System.out.println(s);*/

        //模拟实现toString
        /*int [] array = {1, 2, 3, 4, 5};
        System.out.println(myToString(array));*/


    }
    public static String myToString(int[] array) {
        String s = "[";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                s += array[i] + ", ";
            } else {
                s += array[i];
            }

        }
        s += "]";
        return s;
    }
    public static void main2(String[] args) {
        //遍历数组
       /* int[] array = new int[] {1, 2, 3, 4, 5};*/

        //使用.length 函数
        /*for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println();

        //使用for-each
        for (int x :
                array) {
            System.out.print(x);
        }*/

    }
    public static int max3(int a, int b, int c) {
        int max1 = max(a, b);
        return max(max1, c);
    }
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b, double c) {
        double ret = a > b ? a : b;

        return (ret > c ? ret : c);
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

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = -1;

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }

        return c;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static int fac1(int n) {
        if (n == 1) {
            return 1;
        }

        int ret = n * fac1(n-1);

        return ret;
    }

    public static void main1(String[] args) {
        //写一个函数求两个数最大值
        /*System.out.println(max2(100, 89));
        System.out.println(max3(3, 30, 90));*/

        //求N的阶乘
//        System.out.println(fac(5));

        //阶乘求和
//        System.out.println(facSum(5));

        //求斐波那契数列第 N 项（迭代实现）
       /* System.out.println(fib(6));*/ // 0 1 1 2 3 5 8 13 21


        //和的重载
       /* System.out.println(add(91, 9));
        System.out.println(add(9.1, 0.6, 0.3));*/

        //求最大值重载
       /* System.out.println(max(90, 99));
        System.out.println(max(9.1, 10.8, 6.9));*/

        //递归求 N 的阶乘
//        System.out.println(fac1(5));


    }

}
