public class Test {
    public static void main(String[] args) {
        System.out.println("栈实现队列");
        System.out.println("队列实现栈");
    }
}

//栈实现队列
class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        //判空
        if (empty()) {
            return -1;
        }

        //倒数据
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public int peek() {
        if (empty()) {
            return -1;
        }

        if (s2.isEmpty()) {
            //倒元素
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();


    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}



//队列实现栈
class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }

    public void push(int x) {
        if (q1.isEmpty()) {
            q2.offer(x);
        } else {
            q1.offer(x);
        }
    }

    public int pop() {
        //判空
        if (empty()) {
            return -1;
        }

        //往空队列里转移数据
        if (q1.isEmpty()) {
            int size = q2.size();
            while (size-1 != 0) {
                q1.offer(q2.poll());
                size--;
            }

            return q2.poll();
        } else {
            int size = q1.size();
            while (size-1 != 0) {
                q2.offer(q1.poll());
                size--;
            }

            return q1.poll();
        }
    }

    public int top() {
        if (empty()) {
            return -1;
        }

        int tmp = -1;

        if (q1.isEmpty()) {
            int size = q2.size();
            while (size != 0) {
                tmp = q2.poll();
                q1.offer(tmp);
                size--;
            }

            return tmp;
        } else {
            int size = q1.size();
            while (size != 0) {
                tmp = q1.poll();
                q2.offer(tmp);
                size--;
            }

            return tmp;
        }

    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
