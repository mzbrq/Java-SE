import java.util.Arrays;

public class MyStack {
    private int[] elem;
    private int usedSize;
    private static final int DEFAULT_CAPACITY = 2;

    public MyStack() {
        this.elem = new int[DEFAULT_CAPACITY];
    }

    public MyStack(int capacity) {
        this.elem = new int[capacity];
    }

    //压栈
    public void push(int data) {
        //检查容量
        checkCapacity();

        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    private void checkCapacity() {
        if (this.elem.length == this.usedSize) {
            //增容
            this.elem = Arrays.copyOf(this.elem, 2*this.elem.length);
        }
    }

    //出栈
    public int pop() throws NullException {
        //判空
        if (isNull()) {
            throw new NullException("栈为空");
        }
        //出栈
        int ret = this.elem[this.usedSize-1];
        this.usedSize--;
        return ret;
    }

    public boolean isNull() {
      return this.usedSize == 0;
    }

    public int peek() throws NullException {
        if (isNull()) {
           throw new NullException("栈为空");
        }
        return this.elem[this.usedSize-1];
    }


}
