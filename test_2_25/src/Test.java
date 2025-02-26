import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //下标访问数组越界
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);

    }
    public static void main5(String[] args) {
        //动态初始化
        int[] arr1;
        arr1 = new int[10];

        //静态初始化
        int[] arr2;
        arr2 = new int[] {1, 2, 3, 4, 5};

        //省略new 数据类型[]
        //省略格式不能拆分，不然编译失败
       /* int[] arr3;
        arr3 = {1, 1, 1, 1, 1};*/

    }
    public static void main4(String[] args) {
        //静态初始化数组
        int[] arr1 = {1, 2, 3, 4, 5};
        String[] arr2 = new String[]{"xx", "yy", "zz"};
        System.out.println(Arrays.toString(arr2));
    }
    public static void main3(String[] args) {
        int[] arr1 = new int[10]; //创建一个可以存放10个 int 类型元素的数组
        double[] arr2 = new double[5]; //创建一个可以存放5个 double 类型元素的数组
    }
    public static void main2(String[] args) {
        int[] score = {60, 70, 80, 90};

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
    public static void main1(String[] args) {
        int score1 = 60;
        int score2 = 70;
        int score3 = 80;
        int score4 = 90;

        System.out.println(score1);
        System.out.println(score2);
        System.out.println(score3);
        System.out.println(score4);

        System.out.println("================");

        int[] score = {60, 70, 80, 90};

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }

}
