import java.util.Scanner;

public class PT2 {
    static Scanner scanner = new Scanner(System.in);

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node head;

    public static void main(String[] args) {
        int input, item;
        do {
            System.out.println("[1]Insert\n[2]Traverse");
            System.out.println("[3]Search\n[4]Delete\n[5]Exit");
            System.out.print("[6]Clear Screen\n:");
            input = scanner.nextInt();

            switch(input) {
                case 1:
                    System.out.print("Enter the item: ");
                    item = scanner.nextInt();
                    create(item); 
                    break;

                case 2:
                    traverse();
                    break;

                case 3:
                    search();
                    break;

                case 4:
                    System.out.print("Enter the item to be deleted: ");
                    item = scanner.nextInt();
                    delete(item);

                    break;

                case 5:
                    System.exit(0);
                    break;

                case 6:
                System.out.print("\033[H\033[2J");
                break;  

                default:
                    System.out.println("Please enter a valid choice.");
            }
        } while (input != 5);
    }

    static void create(int item) {
        Node ptr = new Node(item);

        if (head == null) {
            ptr.next = null;
            ptr.prev = null;
            head = ptr;
        } else {
            ptr.prev = null;
            ptr.next = head;
            head.prev = ptr;
            head = ptr;
        }
        System.out.println(item + " has been inserted");
    }

    static void traverse() {
        if (head == null) {
            System.out.println("Empty list.");
            return;
        }

        System.out.print("List: ");
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    static void search() {
        if (head == null) {
            System.out.println("Empty list.");
            return;
        }

        System.out.println("Enter item to be searched: ");
        int item = scanner.nextInt();
        Node ptr = head;
        int i = 1;
        boolean flag = false;
        while (ptr != null) {
            if (ptr.data == item) {
                System.out.println("Item found at location " + i);
                flag = true;
                break;
            }
            i++;
            ptr = ptr.next;
        }
        if (!flag) {
            System.out.println("Item not found.");
        }
    }

    static void delete(int item) {
        if (head == null) {
            System.out.println("Empty list.");
            return;
        }

        Node ptr = head;
        while (ptr != null && ptr.data != item) {
            ptr = ptr.next;
        }
        if (ptr == null) {
            System.out.println("Item not found.");
            return;
        }
        if (ptr == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (ptr.next == null) {
            ptr.prev.next = null;
        } else {
            ptr.prev.next = ptr.next;
            ptr.next.prev = ptr.prev;
        }
        System.out.println(item + " has been deleted.");
    }
}
