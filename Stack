import java.util.Scanner;
import java.util.*;
public class Main{



static int MAXSIZE = 5;       
static int[] stack = new int[MAXSIZE]  ;  
static int top = -1;            

static boolean isempty() {

   if(top == -1)
      return true;
   else
      return false;
}
   
static boolean isfull() {

   if(top == MAXSIZE)
      return true;
   else
      return false;
}

static int peek() {
   return stack[top];
}

static int pop() {
    int data;
	
   if(!isempty()) {
      data = stack[top];
      top = top - 1;   
      return data;
   } else {
    System.out.println("Could not retrieve data, Stack is empty.\n");
   }
   return 0;
}

static int push(int data) {

   if(!isfull()) {
      top = top + 1;   
      stack[top] = data;
   } else {
    System.out.println("Could not insert data, Stack is full.\n");
   }
   return 0;
}

public static void main (String [] args) {
    
    Scanner in = new Scanner(System.in);
    
  for(int x = 0; x < MAXSIZE; x++){
      System.out.print("Enter the Element: ");
      int num = in.nextInt();
      push(num);
  }
    
   System.out.println("Element at top of the stack: " + peek());
   System.out.println("Elements: ");

   // print stack data 
   while(!isempty()) {
      int data = pop();
    System.out.println(""+ data);
   }

    System.out.println("Stack full: " + isfull());
    System.out.println("Stack empty: " + isempty());
  
}
}
