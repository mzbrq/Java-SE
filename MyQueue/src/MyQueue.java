public class MyQueue {
    static class ListNode {
        ListNode prev;
        int val;
        ListNode next;

        public ListNode(int data) {
            this.val = data;
        }
    }


    private ListNode front;
    private ListNode rear;
    int usedSize;

    public void offer(int data) {
        //链表尾插
        ListNode newNode = new ListNode(data);
        if (this.front == null) {
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            newNode.prev = this.rear;
            this.rear = newNode;
        }
        this.usedSize++;
    }

    public int poll() throws NullException {
        //链表头删
        //判断是否队列是否为空
        if (this.front == null) {
            throw new NullException("队列为空");
        }

        int ret = this.front.val;
        if (this.front.next == null) {
            //只有一个节点
            this.front = this.rear = null;
        } else {
            this.front = this.front.next;
        }

        this.usedSize--;
        return ret;
    }


    public int peek() throws NullException {
        if (this.front == null) {
            throw new NullException("队列为空");
        }

        return this.front.val;
    }

    public int getUsedSize() {
        return this.usedSize;
    }

    public boolean empty() {
        return this.usedSize == 0;
    }


}
