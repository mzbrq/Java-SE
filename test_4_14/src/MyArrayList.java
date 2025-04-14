import java.util.Arrays;

public class MyArrayList {
    private int[] array;
    private int size; //记录元素有效个数
    final int DEFAULT_CAPACITY = 4;

    public MyArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.array = new int[capacity];
    }

    //======== 方法 ========

    //展示顺序表
    public void display() {
        if (this.size == 0) {
            System.out.println("顺序表为空");
            return;
        }
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }

    //增容
    private void grow() {
        this.array = Arrays.copyOf(this.array, 2 * this.array.length);
    }

    //是否满了
    public boolean isFull() {
        if (this.array.length == this.size) {
            return true;
        }

        return false;
    }

    //尾插数据
    public void add(int data) {
        if (isFull()) {
            //增容
            grow();
        }

        this.array[this.size] = data;
        this.size++;
    }

    //在 pos 位置处新增元素

    private boolean checkPos(int pos) {
        if (pos >= 0 && pos <= this.size) {
            return true;
        }

        return false;
    }

    public void add(int pos, int data) throws PosOutOfBoundsException {
        //判断 pos 是否合法
        if (!checkPos(pos)) {
            throw new PosOutOfBoundsException("pos 位置不合法！！！" + pos);
        }

        //判断是否增容
        if (isFull()) {
            grow();
        }

        for (int i = this.size; i > pos ; i--) {
            this.array[i] = this.array[i-1];
        }

        this.array[pos] = data;
        this.size++;

    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {
        //遍历数组，看是否有与 toFind 相同的元素
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == toFind) {
                return true;
            }
        }

        return false;
    }

    //查看元素第一次出现对应下标
    public int indexOf(int toFind) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == toFind) {
                return i;
            }
        }

        return -1;
    }

    //获取 pos 位置的元素
    public int get(int pos) throws PosOutOfBoundsException {
        //判断 pos 的合法性
        if (pos < 0 || pos >= this.size) {
            //不合法
            throw new PosOutOfBoundsException("访问位置不合法！！！" + pos);
        }

        return this.array[pos];
    }

    //设置 pos 位置处的元素
    public void set(int pos, int data) throws PosOutOfBoundsException {
        //判断 pos 的合法性
        if (pos < 0 || pos >= this.size) {
            //不合法
            throw new PosOutOfBoundsException("访问位置不合法！！！" + pos);
        }

        this.array[pos] = data;
    }

    //删除
    public void remove(int toRemove) {
        int pos = indexOf(toRemove);

        if (pos == -1) {
            System.out.println("没有该元素");
            return;
        }

        //挪动元素覆盖
        for (int i = pos; i < this.size-1; i++) {
            this.array[i] = this.array[i+1];
        }

        this.size--;
    }


    //获取顺序表长度
    public int size() {
        return this.size;
    }

    //清空顺序表
    public void clear() {
        this.array = null;
        this.size = 0;
    }

}
