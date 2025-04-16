public class MyLinkedList {
    //节点
    public class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode head;
    private int size; // 记录节点个数


    //打印链表
    public void display() {
        ListNode curNode = this.head;

        if (curNode == null) {
            System.out.println("链表为空");
        }

        while (curNode != null) {
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
    //头插
    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);

        newNode.next = this.head;
        head = newNode;
        this.size++;
    }

    //查看节点个数
    public int size() {
        return this.size;
    }

    //尾插
    public void addLast(int data) {
        ListNode newNode = new ListNode(data);
        ListNode curNode = this.head;

        if (this.head == null) {
            this.head = newNode;
            this.size++;
            return;
        }

        //找到尾节点
        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
        this.size++;
    }

    //从任意位置插入，头节点下标为0
    public void addIndex(int pos, int data) throws PosOutOfBoundsException {
        //判断 pos 合法新
        if (!checkPos(pos)) {
            throw new PosOutOfBoundsException("要插入下标不合法: " + pos);
        }

        if (pos == 0) {
            //头插
            addFirst(data);
        } else if (pos == this.size) {
            addLast(data);
        } else {
            ListNode newNode = new ListNode(data);
            ListNode curNode = this.head;

            //找到pos前一个节点
            for (int i = 0; i < pos-1; i++) {
                curNode = curNode.next;
            }

            //链接
            newNode.next = curNode.next;
            curNode.next = newNode;
            this.size++;
        }
    }

    private boolean checkPos(int pos) {
        if (pos < 0 || pos > this.size) {
            return false;
        }
        return true;
    }

    //查找是否包含 key
    public boolean contains(int key) {
        ListNode curNode = this.head;

        if (isNull()) {
            System.out.println("链表为空");
            return false;
        }

        while (curNode != null) {
            if (curNode.val == key) {
                return true;
            }

            curNode = curNode.next;
        }

        return false;
    }

    //判空
    private boolean isNull() {
        if (this.size == 0) {
            return true;
        }

        return false;

    }

    //删除第一次出现的 key
    public void remove(int key) {
        if (isNull()) {
            System.out.println("链表为空");
            return;
        }

        //头节点单独判断
        if (key == this.head.val) {
            //头删
            this.head = this.head.next;
            this.size--;
        } else {
            //找到 key 节点的前一个，没找到返回null
            ListNode prevNode = searchPrev(key);

            if (prevNode == null) {
                System.out.println("没有该节点");
            } else {
                //找到该节点的前一个
                ListNode delNode = prevNode.next;
                prevNode.next = delNode.next;
                this.size--;
            }
        }
    }

    private ListNode searchPrev(int key) {
        ListNode curNode = this.head;

        while (curNode.next != null) {
            if (curNode.next.val == key) {
                return curNode;
            }
            curNode = curNode.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (isNull()) {
            System.out.println("链表为空");
            return;
        }

        ListNode prevNode = this.head;
        ListNode curNode = this.head.next;

        //头节点单独判断
       /* while (curNode != null && curNode.val == key) {
            curNode = curNode.next;
            this.head = curNode;
            this.size--;
        }*/

        while (curNode != null) {
            //找到key节点删除
            if (curNode.val == key) {
                prevNode.next = curNode.next;
                curNode = curNode.next;
                this.size--;
            } else {
                //迭代条件
                prevNode = curNode;
                curNode = curNode.next;
            }


        }

        if (this.head.val == key) {
            this.head = this.head.next;
            this.size--;
        }
    }

    //清空链表
    public void clear() {
        this.head = null;
        this.size = 0;
    }
}
