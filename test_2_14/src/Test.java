import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //两数之和
        int[] array = {1, 7, 11, 32, 89};
        int target = 100;
        int[] sum = sumArray(array, target);
        System.out.println(Arrays.toString(sum));
    }
    public static int[] sumArray(int[] arr, int tg) {
        int[] sum = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                return sum;
            }
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == tg) {
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }
        return sum;
    }
    public static void main10(String[] args) {
        //奇数在偶数前
        int[] array = {1, 2, 2, 3, 3, 4, 3, 4};
        adjust(array);
        System.out.println(Arrays.toString(array));

    }
    public static void adjust(int[] arr) {
        int src = 0; // 找到奇数
        int dest = 0; // 与src交换

        while (src < arr.length) {
            //奇数
            if (arr[src] % 2 != 0) {
                //交换
                int tmp = arr[src];
                arr[src] = arr[dest];
                arr[dest] = tmp;

                src++;
                dest++;
            } else {
                src++;
            }
        }

    }
    public static void main9(String[] args) {
        //修改元素的值
        int[] array = {1, 2, 3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

    }
    public static void main8(String[] args) {
        //使用java自带排序方法
        int[] array = {2, 99, 33, 12, 100, 109, 90};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void main7(String[] args) {
        //数组逆序
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;

        while (left <= right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;

            left++;
            right--;
        }
    }
    public static void main6(String[] args) {
        //冒泡排序
        int[] array = {2, 33, 1, 99, 33, 100, 109};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    flag = true;
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
            if (flag == false) {
                return;
            }
        }
    }
    public static void main5(String[] args) {
        //二分查找
        int[] array = {1, 2, 3, 4, 5, 5, 7, 8, 19};
        int key = 8;
        int ret = binarySearch(array, key);
        System.out.println(ret);
    }
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length-1;

        while (left <= right) {
            int mid = (left + right) >>> 1;

            if (array[mid] > key) {
                right = mid - 1;
            } else if (array[mid] == key) {
                return mid;
            } else {
                left = mid + 1;
            }

        }
        //找不到，返回-1
        return -1;
    }
    public static void main4(String[] args) {
        //查找数组中某个元素，返回下标，找不到返回-1
        int[] array = {1, 3, 12, 33, 0, 100};
        int key = 0;
        int ret = find(array, key);
        System.out.println(ret);
    }
    public static int find(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }

        return -1;
    }
    public static void main3(String[] args) {
        //求数组元素中的平均值
        int[] array = {1, 2, 3, 4, 5, 6};
        double ret = avg(array);
        System.out.println(ret);
    }
    public static double avg(int[] array) {
        double ret = 0.0;
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
        }
        ret /= array.length;
        return ret;
    }
    public static void main2(String[] args) {
        //拷贝数组
        int[] array1 = {1, 2, 3, 4, 5};
        int[] newArray = Arrays.copyOf(array1, array1.length);
        array1[0] = 100;

        System.out.println(Arrays.toString(newArray));

        //拷贝数组某个范围
        int[] array2 = Arrays.copyOfRange(array1, 0, 5);
        System.out.println(Arrays.toString(array2));

        //System.arraycopy()拷贝数组
        int[] array3 = new int[10];
        System.arraycopy(array1, 1, array3, 6, array1.length-1);
        System.out.println(Arrays.toString(array3));
    }
    public static void main1(String[] args) {
        //递归求 N!
//        System.out.println(fac(4));

        //数组转字符串
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1));

        //模拟实现Array.toString()
        System.out.println(myToString(array1));

    }
    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
           ret += array[i] + "";

           if (i != array.length-1) {
               ret += ", ";
           }

        }
        ret += "]";

        return ret;
    }
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        int ret = n * fac(n-1);
        return ret;
    }
}
