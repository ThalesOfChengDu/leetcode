/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = null;
        ListNode cur;
        if(l1 != null && l2 != null){
            if(l1.val < l2.val){
                newList = new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                newList = new ListNode(l2.val);
                l2 = l2.next;
            }
        }
        if(newList == null){
            if(l1 != null)
                return l1;
            else if(l2 != null)
                return l2;
            return null;
        }
        if(l1 == null || l2 == null){
            if(l1 == null){
                newList.next = l2;
            }
            else if(l2 == null){
                newList.next = l1;
                return newList;
            }
            else
                return newList;
        }
        cur = newList;
        while(l1 != null || l2 != null){
            if(l1 == null){
                cur.next = l2;
                break;
            }
            else if(l2 == null){
                cur.next = l1;
                break;
            }
            else{
                if(l1.val < l2.val){
                    cur.next = new ListNode(l1.val);
                    l1 = l1.next;
                }
                else{
                    cur.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
                cur = cur.next;
            }
        }
        return newList;
    }
}
