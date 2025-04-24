public class MyLinkedList {
    private ListNode head;
    private ListNode last;
    private int size;

    class ListNode {
        ListNode prev;
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    //求链表长度
    public int size() {
        return this.size;
    }

    //打印链表
    public void display() {
        ListNode curNode = this.head;

        if (curNode == null) {
            System.out.println("链表为空");
            return;
        }

        while (curNode != null) {
            System.out.print(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
    //头插入
    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);

        if (this.head == null) {
            this.head = this.last = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;

    }

    //尾插
    public void addLast(int data) {
        ListNode newNode = new ListNode(data);

        if (this.head == null) {
            this.head = this.last = newNode;
        } else {
            this.last.next = newNode;
            newNode.prev = this.last;
            this.last = newNode;
        }

        this.size++;
    }

    //任意位置插入
    public void addIndex(int index, int data) {
        //判断index合法性
        checkIndex(index);

        if (index == 0) {
            //头插
            addFirst(data);
            return;
        }

        if (index == this.size) {
            //尾插
            addLast(data);
            return;
        }

        ListNode newNode = new ListNode(data);
        ListNode curNode = searchIndex(index);

        curNode.prev.next = newNode;
        newNode.prev = curNode.prev;

        newNode.next = curNode;
        curNode.prev = newNode;

        this.size++;

    }

    private ListNode searchIndex(int index) {
        ListNode curNode = this.head;

        while (index != 0) {
            curNode = curNode.next;
            index--;
        }

        return curNode;
    }

    private void checkIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index 不合法" + index);
        }
    }


    //查找包含 key 数据
    public boolean contains(int key) {
        //判空
        if (this.head == null) {
            System.out.println("链表为空");
            return false;
        }

        ListNode curNode = this.head;

        while (curNode != null) {
            if (curNode.data == key) {
                return true;
            }

            curNode = curNode.next;
        }

        return false;
    }

    //删除第一次出现的 key
    public void remove(int key) {
      ListNode curNode = this.head;

      while (curNode != null) {
          if (curNode.data == key) {
              //进行删除
              if (curNode == this.head) {
                  //头删
                  this.head = this.head.next;
                  if (this.head != null) {
                      this.head.prev = null;
                  }
              } else {
                  if (curNode.next != null) {
                      //中间删除
                      curNode.prev.next = curNode.next;
                      curNode.next.prev = curNode.prev;
                  } else {
                      //尾删
                      curNode.prev.next = null;
                      this.last = this.last.prev;
                  }
              }
              this.size--;
              return;
          } else {
              //迭代条件
              curNode = curNode.next;
          }
      }
    }

    //删除所有值为 key 的节点
    public void removeAll(int key) {
        ListNode curNode = this.head;

        while (curNode != null) {
            if (curNode.data == key) {
                //进行删除
                if (curNode == this.head) {
                    //头删
                    this.head = this.head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                    }
                } else {
                    if (curNode.next != null) {
                        //中间删除
                        curNode.prev.next = curNode.next;
                        curNode.next.prev = curNode.prev;
                    } else {
                        //尾删
                        curNode.prev.next = null;
                        this.last = this.last.prev;
                    }
                }
                this.size--;
            }
            curNode = curNode.next;
        }
    }

    private ListNode findKey(int toFind) {
        ListNode curNode = this.head;

        while (curNode != null) {
            if (curNode.data == toFind) {
                return curNode;
            }
            curNode = curNode.next;
        }

        return null;
    }

    //清空
    public void clear() {
        ListNode curNode = this.head;

        while (curNode != null) {
            ListNode next = curNode.next;

            curNode.prev = null;
            curNode.next = null;

            curNode = next;
        }

        this.head = this.last = null;
        this.size = 0;
    }

}
