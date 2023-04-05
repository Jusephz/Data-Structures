import java.util.Scanner;

public class OE5_Quicksort{
      public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int a = low; a <= high; a++) {
            if (arr[a] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[a];
                arr[a] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i+1);
    }

    public static void Qsort(int[] arr, int s, int e) {
        if (s <= e) {
            int p = partition(arr, s, e);
            Qsort(arr, s, p-1);
            Qsort(arr, p+1, e);
        }
    }

    public static void printA(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int in=scan.nextInt();
    int Array[] = new int [in];

    System.out.println("Enter the elements of the array:");

    for(int i=0; i<in; i++){
    Array[i] = scan.nextInt();
    }
        int n = Array.length;
        System.out.print("Unsorted List: ");
        printA(Array, n);
        Qsort(Array, 0, n-1);
        System.out.print("Sorted List: ");
        printA(Array, n);
    }
}
