//https://www.interviewbit.com/problems/k-reverse-linked-list/

//Given a singly linked list and an integer K, reverses the nodes of the
//list K at a time and returns modified linked list.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode current=A;
        int count=0;
        ListNode prev=null;
        ListNode next=null;
        
        while(count<B && current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            ++count;
        }
        
        if(next!=null)
            A.next=reverseList(next,B);
        return prev;    
    }
}
