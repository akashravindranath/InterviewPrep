package LeetCode.HasCycle;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Akashravindranath on 6/23/17.
 */
public class Solution {
    Set<ListNode> set = new HashSet<>();
    public boolean hasCycle(ListNode head) {
//        System.out.println(head.val);
        if(head == null) return false;

        if(set.contains(head)){
            return true;
        }
        else{
            set.add(head);
        }
        head = head.next;
        return hasCycle(head);

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}