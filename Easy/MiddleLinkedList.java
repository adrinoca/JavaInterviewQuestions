package Easy;

// Given the head of a singly linked list, return the middle node of the linked list.
//
//If there are two middle nodes, return the second middle node.
//
//Example 1:
//
//Input: head = [1,2,3,4,5]
//Output: [3,4,5]
//Explanation: The middle node of the list is node 3.
//Example 2:
//
//Input: head = [1,2,3,4,5,6]
//Output: [4,5,6]
//Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one

public class MiddleLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {

        ListNode slow_pointer = head;
        ListNode fast_pointer = head;

        while (fast_pointer != null && fast_pointer.next != null) {
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
        }
        return slow_pointer;
    }

    public static void main(String[] args) {
        // Test case 1
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode middle1 = middleNode(node1);
        System.out.println("Middle node value (Expected: 3): " + middle1.val);

        // Test case 2
        ListNode node6 = new ListNode(6);
        node5.next = node6;

        ListNode middle2 = middleNode(node1);
        System.out.println("Middle node value (Expected: 4): " + middle2.val);

        // Test case 3
        ListNode node7 = new ListNode(1);

        ListNode middle3 = middleNode(node7);
        System.out.println("Middle node value (Expected: 1): " + middle3.val);
    }
}

// COMPLEXITY
//
// TIME COMPLEXITY
// We only run through the array once and each iteration implies a constant number of oprations
// so O(n) where n is the length of the array.
//
// SPACE COMPLEXITY
// There is no use of new memory, we only use control variables so O(1).
