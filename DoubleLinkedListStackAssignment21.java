/**
 * DoubleLinkedListStackAssignment21
 */
public class DoubleLinkedListStackAssignment21 {

    NodeStackAssignment21 head;
    NodeStackAssignment21 tail;

    public DoubleLinkedListStackAssignment21() {
        this.head = this.tail = null;
    }

    public void push(String data) {
        NodeStackAssignment21 newNode = new NodeStackAssignment21(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Insert data: " + data);
    }

    public String pop() {
        if (head == null) {
            return "Stack is empty";
        }
        String data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return "Book on top has been removed: " + data;
    }

    public String peek() {
        if (head == null) {
            return "Stack is empty";
        }
        return "Book title on top: " + head.data;
    }

    public void print() {
        NodeStackAssignment21 current = head;
        System.out.println("Info all books");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}