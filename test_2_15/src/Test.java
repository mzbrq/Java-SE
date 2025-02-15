import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //多数元素
        int[] array = {1, 2, 2, 3, 3, 3, 3, 4, 4 ,5};
        Arrays.sort(array);
        System.out.println(array[(array.length / 2)]);
    }
    public static void main3(String[] args) {
        //三个连续奇数
        int[] array = {1,2,34,3,4,5,7,23,12};
        boolean ret = threeConsecutiveOdd(array);
        System.out.println(ret);
    }
    public static boolean threeConsecutiveOdd(int[] arr) {
        //记录连续奇数的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isOddNumber(arr[i])) {
                count++;
                if (count == 3) {
                    //三个连续奇数
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
    public static boolean isOddNumber(int n) {
        if (n % 2 != 0) {
            return true;
        }
        return false;
    }
    public static void main2(String[] args) {
        //连续三个奇数的数组
        int[] array = {1,2,34,3,4,5,7,23,12};
        boolean ret = oddNumber(array);
        System.out.println(ret);
    }
    public static boolean oddNumber(int[] arr) {
        int i = 0;
        int j = i+1;
        int z = j+1;

        while (z < arr.length) {
            if ((arr[i] % 2 != 0)
            && (arr[j] % 2 != 0)
            && (arr[z] % 2 != 0)) {
                return true;
            }
            i++;
            j++;
            z++;
        }
        return false;
    }
    public static void main1(String[] args) {
        //找出只出现一次的数字
        int[] array = {4,1,2,1,2};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }

        System.out.println(ret);
    }
}
