/*asking the user for input of weight in 
pounds and converting into kilos
*/
   //importing a scanner
   import java.util.Scanner;
   
//Name of the Class   
public class Kilograms {
   
   //Main Method
   public static void main(String[] args) {
      
      //creating a new scanner
      Scanner input = new Scanner(System.in);
      
      //prompting the user to enter the number of pounds
      System.out.println("Enter the number of pounds: ");
      //taking input from a user for the number of pounds
      double pounds = input.nextDouble();
      
      //converting pounds into kilograms
      double kilograms = pounds * 0.454;
      
      //displalying weight in kilograms
      System.out.println("Kilograms: " + kilograms);
      
   }//end of main class
}//End of Kilograms class      
