import java.util.Scanner;
public class Queue {
public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int front= -1;
    int rear= -1;
    int MAX = 5;
    int[] queue = new int[MAX];

 
    
    for (int i = 0; i < MAX; i++) {
        System.out.print("Enter the elements: ");
        int x = in.nextInt();
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = x;
            
        }
    System.out.println("Front Element: " + queue[front]);
    System.out.println("Rear Element: " + queue[rear]);
    }
}
