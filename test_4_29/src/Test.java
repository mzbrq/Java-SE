public class Test {
    private int[] elem;
    private int front;
    private int rear;

    public MyCircularQueue(int k) {
        elem = new int[k+1];
    }

    public boolean enQueue(int value) {
        //判断容量
        if (isFull()) {
            return false;
        }

        //入队
        this.elem[this.rear] = value;
        this.rear = (this.rear + 1) % this.elem.length;
        return true;
    }

    public boolean deQueue() {
        //判空
        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % elem.length;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return elem[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int index = (rear == 0) ? elem.length-1 : rear-1;

        return elem[index];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % elem.length == front;
    }

    public static void main(String[] args) {
        System.out.println("循环队列");
    }
}
