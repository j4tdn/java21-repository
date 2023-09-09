public class CircularLinkedList {

    private Node head;
    private Node tail;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Hàm thêm một phần tử vào danh sách liên kết vòng
    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode; // Phần tử cuối cùng trỏ vào newNode
            tail = newNode; // Tail trỏ đến newNode
            tail.next = head; // Phần tử cuối cùng trỏ lại vào phần tử đầu tiên
        }
    }

    // Hàm hiển thị danh sách liên kết vòng
    public void display() {
        if (head == null) {
            System.out.println("Danh sách liên kết vòng trống.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();

        // Thêm các phần tử vào danh sách
        myList.addToEnd(1);
        myList.addToEnd(2);
        myList.addToEnd(3);
        myList.addToEnd(4);

        // Hiển thị danh sách liên kết vòng
        myList.display();
    }
}
