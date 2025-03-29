public class Test {
    public static void main(String[] args) {
       /* Alg<Integer> a1 = new Alg<>();
        Integer[] arr1 = {1, 3, 30, 90, 100, 98};
        System.out.println(a1.findMax(arr1));

        Alg<String> a2 = new Alg<>();
        String[] arr2 = {"ac", "cd", "bd"};
        System.out.println(a2.findMax(arr2));*/


        //使用泛型方法
        /*Alg1 alg1 = new Alg1();
        Integer[] arr1 = {12, 32, 10, 30, 90, 100};
        System.out.println(alg1.findMax(arr1));*/

        //使用静态泛型方法，可以不用实例化对象
        Integer[] arr2 = {32, 23, 90, 98, 89, 193};
        System.out.println(Alg1.findMax(arr2));


    }
}

class Alg<T extends Comparable<T>> {
    public T findMax(T[] arr) {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
class Alg1 {
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}