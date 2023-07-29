import java.util.Scanner;

public class pushpop {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public pushpop(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + data);
        } else {
            stackArray[++top] = data;
            System.out.println(data + " pushed to the stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int data = stackArray[top--];
            System.out.println(data + " popped from the stack.");
            return data;
        }
    }

    public void viewStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum size of the stack: ");
        int maxSize = scanner.nextInt();

        pushpop stack = new pushpop(maxSize);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. View Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    int poppedData = stack.pop();
                    if (poppedData != -1) {
                        System.out.println("Popped element: " + poppedData);
                    }
                    break;
                case 3:
                    stack.viewStack();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
