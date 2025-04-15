public class Test {
    public static void main(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.addLast(1);
        /*mySingleLinkedList.createList();*/
        mySingleLinkedList.addFirst(5);
        mySingleLinkedList.addFirst(4);
        mySingleLinkedList.addFirst(3);
        mySingleLinkedList.addFirst(2);
        mySingleLinkedList.addFirst(1);
        mySingleLinkedList.display();

        System.out.println(mySingleLinkedList.size());
        System.out.println(mySingleLinkedList.contains(3));
        System.out.println(mySingleLinkedList.contains(9));

        mySingleLinkedList.addFirst(90);
        mySingleLinkedList.addFirst(100);
        mySingleLinkedList.display();
        System.out.println(mySingleLinkedList.size());

        mySingleLinkedList.addLast(100);
        mySingleLinkedList.addLast(50);

        mySingleLinkedList.display();

        mySingleLinkedList.addIndex(4, 88);
        mySingleLinkedList.addIndex(0, 11);
        mySingleLinkedList.addIndex(mySingleLinkedList.size(), 99);

        mySingleLinkedList.display();

        mySingleLinkedList.remove(11);
        mySingleLinkedList.display();

        mySingleLinkedList.remove(99);
        mySingleLinkedList.display();

        mySingleLinkedList.remove(88);
        mySingleLinkedList.display();

        mySingleLinkedList.remove(100);
        mySingleLinkedList.remove(90);
        mySingleLinkedList.remove(50);
        mySingleLinkedList.remove(100);

        mySingleLinkedList.display();
        System.out.println(mySingleLinkedList.size());


    }
}
