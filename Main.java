import java.util.Scanner;

/**
 * returns the last digit of a given number
 * @author Rose
 */
public class Main {
  
  //create method to calculate the last digit of a given integer
  public static int lastDigit(int integer) { 

    //assign a variable that will store the last digit
    int lastDig = integer % 10;

    //if statement in case the given integer is negative
    if (lastDig < 0){
      lastDig = lastDig * -1;
    }

    //return the last digit on screen
    return lastDig;
}
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);
    
    //ask user for a number and store it in the variable in the parameter mentioned above
    System.out.println("Please enter an integer");
    int integer = input.nextInt();

    int lastDig = lastDigit(integer);

    //print the last digit on the screen
    System.out.println("The last digit of " + integer + " is " + lastDig);
  }
}
