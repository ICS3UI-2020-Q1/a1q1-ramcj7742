import java.util.Scanner;

/**
 * Asks for temperature in celsius and converts it to fahrenheit
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Creates scanner for user input
    Scanner input = new Scanner(System.in);
   
    // Ask user for temperature in celsius
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");

    //Declare variable to store temperature in celsius
    int cels;

    //Get input from user
    cels = input.nextInt();

    //declare and initialize constant for equation
    final int nine = 9;

    //declare and initialize constant for equation
    final int five = 5;

    //declare and initialize constant for equation
    final int thirty2 = 32;
    
    //Converts celsius to fahrenheit
    int fah = cels * nine / five + thirty2;

    //Tells user the temperature in fahrenheit
    System.out.println(cels + "C is the same as " + fah + "F");



    
  }
}
