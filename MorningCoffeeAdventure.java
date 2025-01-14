import java.util.Scanner;


public class MorningCoffeeAdventure {


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


       // Variables to track user choices
       String size = " ";
       String milk = " ";
       String sugar = " ";


       // Choose Coffee Size
       System.out.println("Choose coffee size: small, medium, or large (case-sensitive)");
        size = sc.nextLine();


       if (size.equals("small")) {
           System.out.println("You chose small coffee.");
       } else if (size.equals("medium")) {
           System.out.println("You chose medium coffee.");
       } else if (size.equals("large")) {
           System.out.println("You chose large coffee.");
       } else {
           System.out.println("Invalid size. Defaulting to Small.");
           size = "Small";
       }
       System.out.println("Do you want milk?: yes or no (case-sensitive)");
       milk = sc.nextLine();
       if (milk.equals("yes")) {
         System.out.println("you chose to have milk in you're " + size +  " coffee");
     } else if (milk.equals("no")) {
         System.out.println("You decided not to have milk in you're " + size + " coffee" );
     }
           System.out.println("Would you like to add sugar? (yes or no, case-sensitive)");
           sugar = sc.nextLine();
    
        
           if (sugar.equals("yes")) {
             System.out.println("you chose to have sugar in you're " + size +  " coffee");
         } else if (sugar.equals("no")) {
             System.out.println("You decided not to have sugar in you're " + size + " coffee" );
         }
         else {
           System.out.println("Invalid input. Assuming no sugar.");
         }
         System.out.println("\nOrder Summary:");
         if (milk.equals("yes") && sugar.equals("yes") ) {
             System.out.println(size + " coffee with milk and sugar.");
         } else if (milk.equals("yes") && sugar.equals("no")) {
             System.out.println(size + " coffee with milk but no sugar.");
         } else if (sugar.equals("yes") && milk.equals("no")) {
             System.out.println(size + " coffee with sugar but no milk.");
         } else {
             System.out.println(size + " black coffee (no milk, no sugar).");
         }
  
         // End of program
         System.out.println("Thank you for your order!");
         sc.close();


        






















    
     }
    


     }
