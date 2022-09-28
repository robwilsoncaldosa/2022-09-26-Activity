import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class arrayList {
public static void main(String[] args) {
 

    Scanner input = new Scanner(System.in);
    String choice, clear;

    List<Integer> Number = new ArrayList<Integer>();

    while(true){
        System.out.println("");

        System.out.println("<<<"+"Menu"+">>>");
        System.out.println("");
        System.out.println("Type the letter of choice:");
        System.out.println("");
        System.out.println("A. Add number");
        System.out.println("B. Remove number");
        System.out.println("C. Display numbers");
        System.out.println("D. Clear number");
        System.out.println("E. Exit");
        System.out.println("");
        System.out.print("YOUR CHOICE: ");
        choice = input.next().substring(0,1);
        choice = choice.toLowerCase();
        System.out.println("");


        switch(choice){
            case "a":
                System.out.print("Enter number: ");
                int add = input.nextInt();
            
                
                if(add > 0){

                    Number.add(add);
        System.out.println("");
                    
                    System.out.println( add + " is successfully added"+"\n");

                    break;

                }
                else{
                    System.out.println("Invalid! Must be a positive integer");
                    break;
                }

                
            case "b":
                System.out.print("Enter number you want to remove: ");
                int remove = input.nextInt();
                System.out.println("");

                if(Number.contains(remove)){
                    Number.remove(Integer.valueOf(remove));
                    System.out.println( remove + " have been removed!");
                    break;
                }else{
                    System.out.println("Error! Input is not in the arraylist");
                    System.out.print("");

                }
                
            case "c":   
       
                System.out.println("All numbers in ArrayList");
                for (Integer number : Number){
                    System.out.print(number);
                    System.out.print(" ");

                }
                break;

            case "d":
                System.out.print("Are you sure you want to clear contents?(yes/no): ");
                clear = input.next().substring(0,1);
                clear = clear.toLowerCase();
                switch(clear){
                    case "y":
                        Number.clear();
                        System.out.println("All numbers has been erased");
                        break;
                    case "n":
                        System.out.println("All numbers has not been erased!");
                        break;
                }
                break;
            case "e":
                input.close();
                System.exit(0);
            default:
                System.out.println("Invalid! Please input the proper choice!");

        
        }

    }
}}
