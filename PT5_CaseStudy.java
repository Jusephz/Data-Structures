import java.util.Scanner;

public class PT5_CaseStudy {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void InOrder(Node n) {
        if (n == null)
            return;
        InOrder(n.left);
        System.out.print(n.data + " ");
        InOrder(n.right);
    }

    public static void PreOrder(Node n) {
        if (n == null)
            return;
        System.out.print(n.data + " ");
        PreOrder(n.left);
        PreOrder(n.right);

    }

    public static void PostOrder(Node n) {
        if (n == null)
            return;
        PostOrder(n.left);
        PostOrder(n.right);
        System.out.print(n.data + " ");
    }

    public static Node createData() {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);
        Node g = new Node(11);

        a.left = b;
        a.right = g;
        b.left = c;
        b.right = d;
        c.left = e;
        e.right = f;

        return a;

    }

    public static void main(String[] args) {
        Node data = createData();
        Scanner scan = new Scanner(System.in);

        do {
            // Structure of the Binary Tree
            System.out.println();
            System.out.println("       5          ");
            System.out.println("      / " + "\\   ");
            System.out.println("     6 " + " 11  ");
            System.out.println("    / " + "\\");
            System.out.println("   7" + "   8");
            System.out.println("  /");
            System.out.println(" 9");
            System.out.println("  \\");
            System.out.println("  10");
            System.out.println();
            // Menu
            System.out.println("[1]In-Order Traversal");
            System.out.println("[2]Pre-Order Traversal");
            System.out.println("[3]Post-Order Traversal");
            System.out.print("Select option:");
            int input = scan.nextInt();

            switch (input) {
                case 1:
                    System.out.print("In-Order Traversal >> ");
                    InOrder(data);
                    break;

                case 2:
                    System.out.print("Pre-Order Traversal >> ");
                    PreOrder(data);
                    break;

                case 3:
                    System.out.print("Post-Order Traversal >> ");
                    PostOrder(data);
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        } while (true);

    }
}
