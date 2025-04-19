public class Test {
    //分割链表
    public ListNode partition(ListNode head, int x) {
        ListNode fFirst = null;
        ListNode fEnd = null;
        ListNode bFirst = null;
        ListNode bEnd = null;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val < x) {
                if (fFirst == null) {
                    fFirst = fEnd = cur;
                } else {
                    fEnd.next = cur;
                    fEnd = fEnd.next;
                }

            } else {
                if (bFirst == null) {
                    bFirst = bEnd = cur;
                } else {
                    bEnd.next = cur;
                    bEnd = bEnd.next;
                }
            }
            //迭代条件
            cur = cur.next;
        }

        if (fFirst == null) {
            return bFirst;
        }

        if (bFirst != null) {
            bEnd.next = null;
        }
        fEnd.next = bFirst;

        return fFirst;
    }


    //合并两个有序链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode newHead = new ListNode(); //哨兵位头节点
        ListNode tmpNode = newHead;

        if (list1.val < list2.val) {
            newHead.next = list1;
        } else {
            newHead.next = list2;
        }


        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tmpNode.next = list1;
                list1 = list1.next;
            } else {
                tmpNode.next = list2;
                list2 = list2.next;
            }

            tmpNode = tmpNode.next;
        }

        if (list1 == null) {
            tmpNode.next = list2;
        }

        if (list2 == null) {
            tmpNode.next = list1;
        }

        return newHead.next;
    }


    //返回导数第k个节点
    public int kthToLast(ListNode head, int k) {
        if (head == null) {
            return -1;
        }

        ListNode slow = head;
        ListNode fast = head;

        //让fast 先走k-1步
        for (int i = 0; i < k-1; i++) {
            fast = fast.next;
        }

        //同时走，直到fast走到尾节点
        while (fast.next != null) {
            //迭代条件
            slow = slow.next;
            fast = fast.next;
        }

        return slow.val;
    }


    //链表的中间节点
    public ListNode middleNode(ListNode head) {
        //判空
        if (head == null) {
            return null;
        }

        //只有一个节点
        if (head.next == null) {
            return head;
        }

        //两个及以上节点

        //初始化
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            //执行过程 && 迭代条件
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    //反转链表
    public ListNode reverseList(ListNode head) {
        //判空
        if (head == null) {
            return null;
        }

        //初始条件
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            //执行过程
            ListNode next = cur.next;
            cur.next = prev;

            //迭代条件
            prev = cur;
            cur = next;
        }

        return prev;

    }


    //移除链表元素
    public ListNode removeElements(ListNode head, int val) {
        //判空
        if (head == null) {
            return null;
        }

        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null) {
            if (cur.val == val) {
                //删除节点
                prev.next = cur.next;
            } else {
                //不用删除，继续往前走
                prev = cur;
            }

            cur = cur.next;
        }

        //单独判断头节点
        if (head.val == val) {
            //删除头节点
            head = head.next;
        }

        return head;

    }


    public static void main(String[] args) {
        System.out.println("刷题");
    }
}
