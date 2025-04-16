public class Test {
    public static void main(String[] args) throws PosOutOfBoundsException{
        MyLinkedList myLinkedList = new MyLinkedList();
        /*myLinkedList.addLast(1);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.display();

        myLinkedList.addLast(5);
        myLinkedList.display();

        System.out.println(myLinkedList.size());

        myLinkedList.addIndex(0, 50);
        myLinkedList.display();

        myLinkedList.addIndex(myLinkedList.size()-1, 50);
        myLinkedList.display();

        myLinkedList.addIndex(1, 100);
        myLinkedList.display();

        myLinkedList.addIndex(myLinkedList.size(), 999);
        myLinkedList.display();

        System.out.println(myLinkedList.contains(999));
        System.out.println(myLinkedList.contains(50));
        System.out.println(myLinkedList.contains(1));*/

        /*myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);

        myLinkedList.display();
        System.out.println(myLinkedList.size());

        myLinkedList.addIndex(4, 5);
        myLinkedList.display();

        myLinkedList.remove(3);
        myLinkedList.display();

        myLinkedList.remove(1);
        myLinkedList.display();

        myLinkedList.remove(5);
        myLinkedList.display();

        myLinkedList.remove(2);
        myLinkedList.display();
        System.out.println(myLinkedList.size());

        myLinkedList.remove(4);
        myLinkedList.display();*/

        /*myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);

        myLinkedList.display();
        System.out.println(myLinkedList.size());

        myLinkedList.remove(1);
        myLinkedList.display();

        myLinkedList.remove(2);
        myLinkedList.display();

        myLinkedList.remove(4);
        myLinkedList.display();

        myLinkedList.remove(4);
        myLinkedList.display();

        myLinkedList.remove(3);
        myLinkedList.display();*/

        //删除所有key节点
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(4);
        myLinkedList.addLast(2);
        myLinkedList.addLast(6);
        myLinkedList.addLast(2);

        myLinkedList.display();

        myLinkedList.removeAllKey(2);

        myLinkedList.display();
        System.out.println(myLinkedList.size());

        myLinkedList.clear();

        myLinkedList.display();

    }
}
