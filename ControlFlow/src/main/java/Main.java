import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int secretNumber = 5; //the secret number
        System.out.println("Choose a number between 1-20."); //gives the following message
        Scanner reader = new Scanner(System.in); //allows for input to be made
         int guess = reader.nextInt(); //guess is the number the user types


        if(secretNumber > guess){
                System.out.println("The secret number is higher than your chosen number");
            } //if input number is less than secret number, this message is shown.
            else if(secretNumber < guess){
                System.out.println("The secret number is lower than your chosen number");
            }//if input number is greater than secret number, this message is shown.
            else if (secretNumber == secretNumber){
                System.out.println("You have figured out the secret number, 5! Well done!");
            }//User entered the correct number.
        }




    }

