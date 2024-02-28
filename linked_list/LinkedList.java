import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstVal = sc.nextInt();
        ListNode head = new ListNode(firstVal);
        ListNode tempNode = head;

        int nextVal;
        // ListNode tail = head;
        for (int i = 0; i < 4; ++i) {
            nextVal = sc.nextInt();
            ListNode nextNode = new ListNode(nextVal);
            tempNode.next = nextNode;
            tempNode = nextNode;
            // tail = nextNode;
        }


        sc.close();
        // System.out.println(tail.val);
        // System.out.println(tail.next);
        System.out.println("Linked List values:");

        tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.val);
            tempNode = tempNode.next;
        }
       
    }

    private static class ListNode {
        private int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }
}