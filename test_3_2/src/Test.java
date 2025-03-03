import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //对没有初始化列数的二维数组进行操作
        int[][] arr = new int[2][];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main2(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[] {1, 2 ,3};
        arr[1] = new int[] {2, 4, 6, 8, 10};

        System.out.println(Arrays.deepToString(arr));

    }
    public static void main1(String[] args) {
        int[][] arr1 = {{2, 4, 6}, {1, 3, 5, 7}};

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1);

    }
}
