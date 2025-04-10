import java.util.*;

public class Test {
    public static void main(String[] args) {
        //遍历数组
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //方法一：for循环

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        //方法二：for - each
        for (Integer x :
                list) {
            System.out.print(x + " ");
        }

        System.out.println();

        //方法三：迭代器
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        //迭代器：从后往前遍历
        ListIterator<Integer> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

    }
    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //删除下标
        list.remove(2);
        System.out.println(list);

        //删除元素
        list.remove(new Integer(2));
        System.out.println(list);

    }
    public static void main1(String[] args) {
        List<Integer> list1 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(list1);

        list2.add(100);

        System.out.println(list2);


    }
}
