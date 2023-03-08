import java.util.Scanner;
import java.io.*;
public class OE4 {
    public static void main(String[] args) 
    {
     
        do{
            //Main Menu
        Scanner in = new Scanner(System.in);
        System.out.println("\n\n[1] Fibonacci series number\n[2] Factorial of a number");
        System.out.println("[3] Reverse a number\n[4] Reverse a word\n[5] Tower of Hanoi\n[0] Exit the program");
        System.out.print("Select your Choice:  ");
        int input = in.nextInt();

        switch (input){
            case 1:{
                //To input a value
                Scanner num = new Scanner(System.in);
                System.out.print("\nEnter a Number:  ");
                int output = num.nextInt();


                int ft = 0;
                int st = 1;
                System.out.print("Fibonnaci of " + output + ":  ");
                for (int i = 1; i<= output; i++){
                System.out.print(ft + " ");
                int nt = ft + st;
                ft = st;
                st = nt;
                }
                pwait();
                break;
            }
            case 2:{
                //To input a value
                Scanner num = new Scanner(System.in);
                System.out.print("\nEnter a Number:  ");
                int output = num.nextInt();
                

                int temp = 1;
                System.out.print("Factorial of " + output + ":  ");
                for (int i = 1; i<=output; ++i){
                    temp = temp * i;
                }
                System.out.print(temp + " ");
                pwait();
                break;
            }
            case 3:{
                //To input a value
                Scanner num = new Scanner(System.in);
                System.out.print("\nEnter a Number to be Reversed:  ");
                int output = num.nextInt();


                int temp = 0;
                System.out.print("Reversed number of " + output + ":  ");
                while (output != 0){
                    int i = output % 10;
                    temp = temp * 10 + i;
                    output /= 10;
                }
                System.out.print(temp + " ");
                pwait();
                break;
            }
            case 4:{
                //To input a value
                Scanner num = new Scanner(System.in);
                System.out.print("\nEnter a Word to be Reversed:  ");
                String output = num.nextLine();
                

                String temp="";
                System.out.print("Reversed word of " + output + ":  ");
                for(int i = output.length() - 1; i >= 0; i--){
                    temp = temp + output.charAt(i);
                }
                System.out.print(temp + " ");
                pwait();
                break;
            }
            case 5:{
                 //To input a value
                 Scanner num = new Scanner(System.in);
                 System.out.print("\nEnter a Number:  ");
                 int output = num.nextInt();
                Towers(output, 'A', 'B', 'C');
                pwait();
                break;
            }
            case 0:{
                System.exit(0);
                break;
            }
            default:{
                System.out.print("Invalid Choice!");
                pwait();
            }

            
        }

        
        }while(true); 
    }
    
    public static void Towers(int topN, char from, char inter, char to) {
        if (topN == 1) {
           System.out.println("Disk 1 from " + from + " to " + to);
        } else {
           Towers(topN - 1, from, to, inter);
           System.out.println("Disk " + topN + " from " + from + " to " + to);
           Towers(topN - 1, inter, from, to);}
        }

    public static void pwait(){
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nPress any key to continue");
        String key = in.nextLine();
        System.out.print("\033[H\033[2J");  
    }
}
