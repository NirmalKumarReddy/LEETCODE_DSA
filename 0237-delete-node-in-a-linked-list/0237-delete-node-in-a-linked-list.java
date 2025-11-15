class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;      // Copy value from next node
        node.next = node.next.next;    // Delete next node by skipping it
    }
}
