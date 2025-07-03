class MyLinkedList {

    private ListNode head;
    private ListNode tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int get(int index) {
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) return -1;
            temp = temp.next;
        }
        if (temp == null) return -1;
        return temp.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode();
        node.val = val;

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode();
        node.val = val;

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        ListNode curr = head;
        for (int i = 0; i < index - 1; i++) {
            if (curr == null) return;
            curr = curr.next;
        }

        if (curr == null) return;

        ListNode node = new ListNode();
        node.val = val;
        node.next = curr.next;
        curr.next = node;

        if (node.next == null) {
            tail = node; // update tail if added at the end
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (head == null) return;
            head = head.next;
            if (head == null) tail = null; // list became empty
            return;
        }

        ListNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null || temp.next == null) return;
            temp = temp.next;
        }

        if (temp.next == null) return;

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
    }
}

class ListNode {
    int val;
    ListNode next;
}
