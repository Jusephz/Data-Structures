public class LinkedLists {

    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void beginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void end(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void after(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        //First
        list.beginning(7);
        list.beginning(5);
        list.beginning(3);
        list.beginning(1);
        System.out.println("Adding the node into the linked list at beginning.");
        list.display();

        //Last
        list.end(2);
        list.end(4);
        list.end(6);
        System.out.println("Adding the node into the linked list to the end.");
        list.display();

        //After the node
        list.after(list.head.next, 0);
        System.out.println("Adding the node into the linked list after the specified node which is 3");
        list.display(); 
    }
}