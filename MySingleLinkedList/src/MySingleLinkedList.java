public class MySingleLinkedList {

    //节点
    class ListNode {
        public int val; // 存放数据
        public ListNode next; //存放下一个节点的地址

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head; //链表的头节点
    private int size; //记录链表节点个数

    //临时创建一个简易的链表
    public void createList() {
        //实例化节点
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        //链接节点
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        //设置头节点
        this.head = node1;
    }

    //打印链表
    public void display() {
        ListNode curNode = this.head;

        while (curNode != null) {
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    //得到链表的长度
    public int size() {
        return this.size;
       /* ListNode curNode = this.head;
        int count = 0;

        while (curNode != null) {
            count++;
            curNode = curNode.next;
        }

        return count;*/
    }

    //判断链表是否包含key
    public boolean contains(int key) {
        ListNode curNode = this.head;

        while (curNode != null) {
            if (curNode.val == key) {
                return true;
            }
            curNode = curNode.next;
        }
        return false;
    }

    //头插
    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);

        newNode.next = head;
        head = newNode;
        this.size++;
    }

    //尾插
    public void addLast(int data) {
        ListNode newNode = new ListNode(data);
        ListNode curNode = this.head;

        //判断链表是否为空
        if (this.head == null) {
            //直接头插
            head = newNode;
            this.size++;
            return;
        }

        //遍历链表，找到尾节点
        while (curNode.next != null) {
            curNode = curNode.next;
        }

        //进行尾插
        curNode.next = newNode;
        this.size++;
    }

    //任意位置插入
    public void addIndex(int index, int data) {
        //判断 index 的合法性
        if (index < 0 || index > this.size) {
            System.out.println("index不合法");
            return;
        }

        if (index == 0) {
            //头插
            addFirst(data);
        } else if (index == this.size) {
            //尾插
            addLast(data);
        } else {
            ListNode newNode = new ListNode(data);
            ListNode curNode = head;

            //找到index前一个节点
            for (int i = 0; i < index-1; i++) {
                curNode = curNode.next;
            }

            newNode.next = curNode.next;
            curNode.next = newNode;
            this.size++;
        }
    }

    //删除第一次出现的 key
    public void remove(int key) {
        ListNode curNode = searchPrev(key);

        //判空
        if (this.head == null) {
            System.out.println("链表为空");
            return;
        }

        //头删
        if (this.head.val == key) {
            //头删
            this.head = this.head.next;
            this.size--;
            return;
        }

        //判断是否链表是否有 key
        if (curNode == null) {
            System.out.println("链表没有" + key);
            return;
        }

        ListNode delNode = curNode.next;
        curNode.next = delNode.next;
        this.size--;

    }

    //找到要key 节点的前一个
    private ListNode searchPrev(int key) {
        ListNode curNode = head;

        while (curNode.next != null) {
            //查找key
            if (curNode.next.val == key) {
                return curNode;
            }
            curNode = curNode.next;
        }

        return null;
    }

}
