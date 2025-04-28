import java.util.Arrays;

public class MyStack {
    private int[] elem;
    private int top;
    private static final int DEFAULT_CAPACITY = 2;

    public MyStack() {
        this.elem = new int[DEFAULT_CAPACITY];
    }

    public MyStack(int capacity) {
        this.elem = new int[capacity];
    }

    //======= 方法 =======

    //压栈
    public void push(int data) {
        //检查容量
        checkCapacity();

        //压栈
        this.elem[this.top] = data;
        this.top++;
    }

    private void checkCapacity() {
        if (this.top == this.elem.length) {
            //增加容量
            grow();
        }
    }

    //增容方法
    private void grow() {
        this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
    }

    //出栈
    public int pop() throws StackNullException {
        //判空
        isNull();

        int ret = this.elem[this.top-1];
        this.top--;
        return ret;
    }


    //判空
    public boolean empty() {
        return this.top == 0;
    }

    //查看栈顶元素
    public int peek() throws StackNullException {
        //判空
        isNull();

        return this.elem[this.top-1];
    }

    private void isNull() throws StackNullException {
        if (this.top == 0) {
            throw new StackNullException("栈为空");
        }
    }


    //查看栈中有效个数
    public int size() {
        return this.top;
    }
}
