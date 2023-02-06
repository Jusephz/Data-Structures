import java.util.Scanner;
public class OE2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("You've enter " + n + " of your choice");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index [" + i + "] number :");
            array[i] = scan.nextInt();
        }
        do {
            System.out.println(" ");
            System.out.println("[1] for Bubble Sort.");
            System.out.println("[2] for Insertion Sort.");
            System.out.print("Enter your choice: ");
            int sort = scan.nextInt();
            switch (sort) {
                case 1:
                    bubbleS(array);
                    break;
                case 2:
                    insertionS(array);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }

    public static void bubbleS(int[] arr) {
        int n = arr.length;
        int iteration = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                iteration++;
            }
        }

        System.out.println("Final Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNumber of iterations: " + iteration);
    }
    public static void insertionS(int[] arr) {
        int n = arr.length;
        int iteration = 0;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                iteration++;
            }
            arr[j + 1] = key;
        }
        System.out.println("Final Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNumber of iterations: " + iteration);
    }
}
