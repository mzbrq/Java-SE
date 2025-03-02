import javax.management.MBeanAttributeInfo;
import java.util.Arrays;

public class Test {
    public static int[] fib(int n) {
        int[] arr1 = new int[n];
        arr1[0] = arr1[1] = 1;

        for (int i = 2; i < n; i++) {
            arr1[i] = arr1[i-1] + arr1[i-2];
        }

        return arr1;
    }
    public static void main(String[] args) {
        int[] arr = fib(10);
        System.out.println(Arrays.toString(arr));
    }
    public static void func2(int[] a) {
        a[0] = 100;
    }
    public static void main7(String[] args) {
        int[] arr = {1, 2 ,3, 4};
        System.out.println("修改前：arr[0] = " + arr[0]);

        func2(arr);

        System.out.println("修改后：arr[0] = " + arr[0]);
        System.out.println("成功修改！！！");

    }
    public static void func(int x) {
        System.out.println("修改前x = " + x);
        x = 99;
        System.out.println("修改后x = " + x); // x 已经被修改为99
    }
    public static void main6(String[] args) {
        int a = 100;
        System.out.println("修改前a = " + a);
        func(a);

        System.out.println("修改后a = " + a);
    }
    public static void main5(String[] args) {
        //保存数据
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main4(String[] args) {
        int[] arr = null;
        //System.out.println(arr[0]);
        System.out.println(arr);
    }
    public static void main3(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[4];

        arr1 = arr2;
        arr2[0] = 11;
        arr2[1] = 22;
        arr2[2] = 33;
        arr2[3] = 44;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
    public static void main2(String[] args) {
        int a = 0;
        int b = 100;

        int[] arr = new int[] {1, 2, 3, 4, 5};

    }
    public static void main1(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
    }
}
