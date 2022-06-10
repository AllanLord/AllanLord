 // @author allan

import java.util.Scanner;

public class centsToDollars {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("How many cents do you have:");
     
     int cents = s.nextInt();
     double dollars = (cents / 100);
     double cent = (cents % 100);
     System.out.println("You have: $" + dollars + " " + "dollars and " + " " + cent + " " + "cents" );
    
    }
    
}
