import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        //头插
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);

        myLinkedList.display();

        //尾插
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);

        myLinkedList.display();


        //任意位置插入
        myLinkedList.addIndex(6, 100);
        myLinkedList.display();

        //删除
//        myLinkedList.addLast(1);
        myLinkedList.remove(1);
        myLinkedList.display();

        myLinkedList.remove(2);
        myLinkedList.display();

        myLinkedList.remove(3);
        myLinkedList.display();

        myLinkedList.remove(4);
        myLinkedList.display();

        myLinkedList.remove(5);
        myLinkedList.display();

        myLinkedList.remove(6);
        myLinkedList.display();

        myLinkedList.addLast(100);
        myLinkedList.addLast(100);
        myLinkedList.addLast(100);
        myLinkedList.addLast(100);
        myLinkedList.display();

        myLinkedList.removeAll(100);
        myLinkedList.display();

        //测试清空
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);

        myLinkedList.display();

        myLinkedList.clear();

        myLinkedList.display();
        System.out.println(myLinkedList.size());


        System.out.println("=================================");


        //遍历链表
        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);

        //方法一
        for (Integer x : list1) {
            System.out.print(x + " ");
        }
        System.out.println();

        //方法二
        ListIterator<Integer> it = list1.listIterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        //反向遍历
        ListIterator<Integer> it1 = list1.listIterator(list1.size());

        while (it1.hasPrevious()) {
            System.out.print(it1.previous() + " ");
        }
        System.out.println();
    }
}
