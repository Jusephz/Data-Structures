import java.util.Scanner;
public class Prelims{
    public static void main(String[] args) {

        //Program Start

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Elements\n : ");
        int num = scan.nextInt();
        String [] array = new String[num];
        
            
            for (int i = 0; i <num; i++) { 
                if(i <= num){
                    System.out.print("Enter the index [" + i  + "] String :");
                }
            array[i] = scan.next();
            
            }
            
            System.out.print("\nUnsorted String : ");
            for (int i = 0; i < num; i++) {
            System.out.print("[" + array[i] + "] ");
            }

        //Bubble Sort
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
               if (array[j].compareTo(array[j + 1]) > 0) {
                  String temp = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = temp;
               }
            }
         }
         System.out.println("");
         System.out.println("\nBubble sort: ");
         for (int i = 0; i < num; i++) {
            System.out.print("[" + array[i] + "] ");
         }
   
        //Insertion Sort
        for (int i = 1; i < num; i++) {
            String key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
               array[j + 1] = array[j];
               j = j - 1;
            }
            array[j + 1] = key;
         }
         System.out.println("");
         System.out.println("\nInsertion sort: ");
         for (int i = 0; i < num; i++) {
            System.out.print("[" + array[i] + "] ");
         }
         System.out.println("");
         System.out.println("");
         scan.close();
     }
}