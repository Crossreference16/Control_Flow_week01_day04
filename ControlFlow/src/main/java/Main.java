import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        String guess = reader.nextLine();

        int number = 5;


        //boolean isCorrect = false;

            if(guess < 5){
                System.out.println("The secret number is higher than your chosen number");;
            }
            else if(guess > 5){
                System.out.println("The secret number is lower than your chosen number");
            }
            else {
                System.out.println("You have figured out the secret number, 5! Well done!");
                //isCorrect = true;git
            }




    }
}
