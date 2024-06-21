/**
 * DoubleLinkedListAssignment21
 */
public class DoubleLinkedListAssignment21 {

    NodeAssignment21 head;
    NodeAssignment21 tail;

    public DoubleLinkedListAssignment21() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int data) {
        NodeAssignment21 newNode = new NodeAssignment21(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Insert data in Head position");
    }

    public void addLast(int data) {
        NodeAssignment21 newNode = new NodeAssignment21(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Insert data in Tail position");
    }

    public void addAtIndex(int data, int index) {
        NodeAssignment21 newNode = new NodeAssignment21(data);
        if (index == 0) {
            addFirst(data);
        } else {
            NodeAssignment21 current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                if (current.next != null) {
                    current.next.prev = newNode;
                }
                newNode.prev = current;
                current.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                System.out.println("Insert Data\nData node: " + data + "\nIn index: " + index);
            } else {
                System.out.println("Index out of range");
            }
        }
    }

    public void removeFirst() {
        if (head != null) {
            System.out.println("Remove data in Head position");
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }

    public void removeLast() {
        if (tail != null) {
            System.out.println("Remove data in Tail position");
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }
    }

    public void removeAtIndex(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeAssignment21 current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            if (current != null && current.prev != null) {
                System.out.println("Remove data by index");
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
            } else {
                System.out.println("Index out of range");
            }
        }
    }

    public void print() {
        NodeAssignment21 current = head;
        System.out.println("Print data");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void searchData(int data) {
        NodeAssignment21 current = head;
        int index = 0;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Data found at index: " + index);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Data not found");
    }

    public void sortData() {
        if (head == null) return;
        NodeAssignment21 current = head, index = null;
        int temp;
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data < index.data) {  
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
        System.out.println("Data sorted in descending order");
    }
}