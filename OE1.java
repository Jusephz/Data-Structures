import java.util.Scanner;

public class OE1{

    public static void main(String[] args){
        int lol;
        Scanner array = new Scanner(System.in);
        System.out.println("[1] Traverse Array");
        System.out.println("[2] Delete Array");
        System.out.println("[3] Search Array");
        System.out.println("[4] Update Array");
        System.out.print("Enter Array: ");
        lol=array.nextInt();

        switch(lol){
            case 1:
            Traverse();

            break;
            case 2:
            
            Delete();
      
            break;
            case 3:
            
            Search();
      
            break;
            case 4:
            Update();
            break;

            default:
            System.out.print("Incorrect Choice");
        }
    }
public static void Traverse(){
        int arr[] = {1,2,3,4,5};
        System.out.println("Traversing the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Delete(){
        int arr[] = {1,2,3,4,5};
        int a, index;
        int b = 5;

        System.out.println("Delete the Index Array");
        System.out.print("Input Index:");
        Scanner del = new Scanner(System.in);
        a=del.nextInt();
        index = a;
        
        while( a < b) {
            arr[a-1] = arr[a];
            a = a + 1;
         }
        
         b = b -1;
    

         System.out.println("Array after deleting element at index " + index + ":");
        for (int c = 0; c < arr.length - 1; c++) {
            System.out.print(arr[c] + " ");
        }
        
    }


    public static void Search(){
    // item for 1-5
    // a is use for scanner
    // b is the length of array which is 5
    int arr[] = {1,2,3,4,5};
    int a,index,c;
    int b = 5;

    // main line for scanner
    System.out.println("Search the Index Array");
    System.out.print("Input Index:");
    Scanner sear = new Scanner(System.in);
    a=sear.nextInt();
    index = a;
    c = arr[a-1];


    // main line for search

    while( a < b){
        if( arr[a] == b ) {
        break;
        }
        a = b;   
       
        
     }
     System.out.println("Element " + index + " found at index " + c + " in the array.");
    


    }


    public static void Update(){
        
     // main line for scanner
    int arr[] = {1,2,3,4,5};
    int a,b,index,index2;

     System.out.println("Update the Index Array");
     System.out.print("Input Index:");
     Scanner upd = new Scanner(System.in);
     a=upd.nextInt();
     System.out.print("Update the Index:");
     Scanner upd2 = new Scanner(System.in);
     b=upd2.nextInt();
     index = a;
     index2 = b;

     arr[a-1] = b;
     System.out.println("Array after updating element at index " + index + " with value " + index2 + ":");
     for (int c = 0; c < arr.length ; c++) {
        System.out.print(arr[c] + " ");
        }
    }

    }