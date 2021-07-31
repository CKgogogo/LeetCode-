package Solution;

public class Solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode ans = temp;
        int k = 0;
        while (l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int newVal = x + y + k;
            k = newVal % 10;
            newVal = newVal / 10;
            temp.next = new ListNode(newVal);

            temp = temp.next;
            if (l1 != null){l1 = l1.next;}
            if (l2 != null){l2 = l2.next;}
        }
        if (k == 1){
            temp.next = new ListNode(1);
        }
        return ans.next;
    }
     static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
