import java.util.Scanner;
import java.util.Random;

public class OE6_Hybrid{

    //QuickSort
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
    //Insertion Sort
   public static void Isort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        do {
        System.out.println("[1] Input Data? ");
        System.out.println("[2] Random Data? ");
        System.out.println("[3] Exit? ");
        System.out.print("Enter Choice : ");
        int input = sw.nextInt();
        
        switch(input){
            
            case 1:
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter the length of the array: ");
                int in=scan.nextInt();
                int Array[] = new int [in];
                System.out.print("Enter the elements of the array:");

                for(int i=0; i<in; i++){
                Array[i] = scan.nextInt();}
                int n = Array.length;
                System.out.print("Unsorted List: ");
                printA(Array, n);

                if(in <= 10){
                System.out.println("Using Quicksort");
                Qsort(Array, 0, n-1);
                System.out.print("Sorted List: ");
                printA(Array, n);
                }
                else if (in > 10){
                System.out.println("Using Insertion");
                Isort(Array);
                System.out.print("Sorted List: ");
                printA(Array, n);
                }
            case 2:
                Scanner scan1 = new Scanner(System.in);
                System.out.print("Enter the length of the array: ");
                int in1 = scan1.nextInt();
                int Array1[] = new int [in1];
                
                Random rand = new Random();
                System.out.print("The elements randomly inputted: ");
                for (int i = 0; i < in1; i++) {
                Array1[i] = rand.nextInt(100);}
                int n1= Array1.length;
                printA(Array1, n1);
                
                if(in1 <= 10){
                System.out.println("Using Quicksort");
                Qsort(Array1, 0, n1-1);
                System.out.print("Sorted List: ");
                printA(Array1, n1);
                }
                else if (in1 > 10){
                System.out.println("Using Insertion");
                Isort(Array1);
                System.out.print("Sorted List: ");
                printA(Array1, n1);
                }
            case 3:
            System.exit(0);

            default:
            System.out.println("Invalid Input!");
        }
    }while (true);
}
}
