package LeetCode.AddTwoNumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(l1.val);
        System.out.println(l2.val);
        long sum = 0;
        long sum2 = 0;
        long multiplier = 1;
        ListNode head = new ListNode(0);
        ListNode res = head;
        int carry = 0;
        while(l1 != null || l2 !=  null || carry > 0){


            sum = ((l1 != null)?l1.val : 0) + ((l2 != null) ? l2.val : 0);
            if(carry > 0) sum ++;
            carry = 0;
            if(sum >= 10) {
                carry = 1;
                sum = sum%10;
            }
            ListNode newNode = new ListNode((int)(sum%10));
            head.next = newNode;
            head = newNode;
            sum = 0;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }

        // if(sum == 0) return head;
        return res.next;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

}