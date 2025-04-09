import java.util.Arrays;

public class MyArrayList {
    private int[] arr; //存放数据的数组
    private int usedSize; //记录存放数据的个数
    private final int INIT_SIZE = 10; //初始化数组容量

    //通过构造方法初始化成员变量

    //默认数组容量
    public MyArrayList() {
        this.arr = new int[INIT_SIZE];
    }

    //指定数组大小容量
    public MyArrayList(int capacity) {
        this.arr = new int[capacity]; // 指定数组容量为capacity
    }


    //============== 方法 ==============

    //拿到元素个数


    public int getUsedSize() {
        return usedSize;
    }

    //判断顺序表是否满了
    public boolean isFull() {
        if (this.usedSize == this.arr.length) {
            return true;
        }

        return false;
    }

    //增容
    public void capacityIncrease() {
        this.arr = Arrays.copyOf(this.arr, 2*this.arr.length);
    }

    //打印顺序表
    public void display() {

        if (this.usedSize == 0) {
            System.out.println("顺序表为空");
            return;
        }
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.arr[i] + " ");
        }

        System.out.println();
    }

    //添加数据，默认在顺序表尾部插入
    public void add(int data) {
       if (isFull()) {
           //增容
           capacityIncrease();
       }
        this.arr[this.usedSize] = data;
        this.usedSize++;
    }

    //在 pos 处 插入数据
    public void add(int pos, int data) {
        if (isFull()) {
            //增容
            capacityIncrease();
        }

        //对 pos 进行检查：必须符合顺序表的插入规则
        if (pos < 0 || pos > this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("插入位置不合法！: " + pos);

        }

        //挪动数据
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.arr[i+1] = this.arr[i];
        }

        //插入数据
        this.arr[pos] = data;
        this.usedSize++;
    }

    //判断顺序表中，是否包含某个元素
    public boolean contains(int data) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.arr[i] == data) {
                return true;
            }
        }

        return false;
    }

    //查找某个元素的下标
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.arr[i] == toFind) {
                return i;
            }
        }

        return -1;
    }


    //获取 pos 位置的元素
    public int get(int pos) {
        //判断 pos 的合法性
        if (pos < 0 || pos >= this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("获取位置不合法：" + pos);
        }

        return this.arr[pos];
    }

    //给 pos 位置的元素 设为 value
    public void set(int pos, int value) {
        //判断 pos 的合法性
        if (pos < 0 || pos >= this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("访问位置不合法：" + pos);
        }

        this.arr[pos] = value;
    }


    //删除第一次出现的元素
    public void remove(int toRemove) {
        //查找是否有该元素
        int pos = indexOf(toRemove);

        if (pos == -1) {
            //没有该元素
            System.out.println("顺序表中，没有该元素");
            return;
        }

        //覆盖数据
        for (int i = pos; i < this.usedSize-1; i++) {
            this.arr[i] = this.arr[i+1];
        }
        this.usedSize--;
    }

    //清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
}
