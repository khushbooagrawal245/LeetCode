/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head.next;
        int c=0;
        
        if(head.next == null && n==1){
            return null;
        }
        if(size(head)==n){
            head = head.next;
        }
        while(p2!=null){
            
            c++;
            if(c==size(head)-n){
                p1.next = p2.next;
            }
            p1 =p1.next;
            p2 = p2.next;
        }
        return head;
    }
    
    public static int size(ListNode head){
        ListNode i = head;
        int ct=0;
        while(i !=null){
            ct ++;
            i = i.next;
        }
         // System.out.println(ct);
        return ct;
    }
}