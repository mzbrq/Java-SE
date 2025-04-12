import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

    }
    public static void main3(String[] args) {
        //cvte

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        String str1 = "welcome to cvte";
        String str2 = "come";

        //把 str1 的每个元素存到 list1 中
        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.charAt(i));
        }

        //把 str2 的每个元素存到哦 list2 中
        for (int j = 0; j < str2.length(); j++) {
            list2.add(str2.charAt(j));
        }

        System.out.println(list1);
        System.out.println(list2);

        //遍历 list1，把 list2 中出现的元素删除
        int i = 0;
        while (i < list1.size()) {
            boolean flg = true;
            int ch = list1.get(i);

            for (int j = 0; j < list2.size(); j++) {
                if (ch == list2.get(j)) {
                    list1.remove(i);
                    flg = false;
                }
            }

            if (flg) {
                i++;
            }

        }

        System.out.println(list1);


        System.out.println("===================================");

        //方法二

        //思路：看 str1 中 的字符在 str2 中是否有包含，没有就放到链表

        List<Character> list3 = new ArrayList<>();

        for (int j = 0; j < str1.length(); j++) {
            char ch = str1.charAt(j);

            if (!str2.contains(ch + "")) {
                //不包含
                list3.add(ch);
            }
        }

        System.out.println(list3);

        for (int j = 0; j < list3.size(); j++) {
            System.out.print(list3.get(j) + " ");
        }
    }
    public static void main2(String[] args) {
        //遍历数组

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);

        //方法一：for循环
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

        System.out.println();

        //方法二：for - each
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }

        System.out.println();

        //方法三：使用迭代器
        Iterator<Integer> iterator = list1.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        list1.clear();

    }
    public static void main1(String[] args) {
        //构造方法
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        list1.add(1, 99);

        System.out.println(list1);

        list1.remove(1);

        System.out.println(list1);

        list1.remove(new Integer(3));

        System.out.println(list1);

        System.out.println(list1.get(1));

        list1.add(99);

        System.out.println(list1);

        list1.set(2, 3);

        System.out.println(list1);

        System.out.println(list1.contains(3));
        System.out.println(list1.contains(99));

        System.out.println(list1.indexOf(2));

        list1.add(2);

        System.out.println(list1);

        System.out.println(list1.lastIndexOf(2));

        List<Integer> list2 = list1.subList(1, 3);

        System.out.println(list2);

        //对list2 修改，会影响 list1

        list2.set(0, 100);

        System.out.println(list1);
        System.out.println(list2);


        list2.clear();
        System.out.println(list2);
        System.out.println(list1);

        list1.set(1, 99);
        System.out.println(list1);

        list1.clear();
        System.out.println(list1);

    }
}
