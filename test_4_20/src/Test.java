public class Test {
    //相交链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA, pB = headB;

        while (pA != pB) {
            if (pA == null) {
                pA = headB;
            } else {
                pA = pA.next;
            }

            if (pB == null) {
                pB = headA;
            } else {
                pB = pB.next;
            }
        }

        return pA;
    }

    //反转链表
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;

            //迭代条件
            prev = cur;
            cur = next;
        }

        head.next = null;
        return prev;
    }

    //回文链表
    public boolean isPalindrome(ListNode head) {
        //判空
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        //找到链表中间节点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //逆置中间节点往后的节点
        ListNode cur = slow.next;
        slow.next = null;

        while (cur != null) {
            //执行过程
            ListNode next = cur.next;
            cur.next = slow;
            //迭代条件
            slow = cur;
            cur = next;
        }

        //开始比较

        //方式一
        // ListNode tmp = head;

        // while (slow != null) {
        //     if (tmp.val != slow.val) {
        //         return false;
        //     }

        //     //迭代条件
        //     tmp = tmp.next;
        //     slow = slow.next;
        // }

        //  return true;

        //方式二
        ListNode tmp = head;

        while (tmp != slow) {
            if (tmp.val != slow.val) {
                return false;
            }

            if (tmp.next == slow) {
                return true;
            }

            //迭代条件
            tmp = tmp.next;
            slow = slow.next;
        }


        return true;

    }


    public static void main(String[] args) {
        System.out.println("刷题");
    }
}
