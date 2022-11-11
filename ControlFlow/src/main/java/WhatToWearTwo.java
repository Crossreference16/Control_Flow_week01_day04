
import java.util.Scanner;

public class WhatToWearTwo {
    public static void main(String[] args) {
        System.out.println("Wondering what to wear today? What is the weather like?");
        System.out.println("Cloudy, rainy, sunny or snowy?");


        Scanner reader = new Scanner(System.in);

        String weather = reader.nextLine();
        System.out.println("what is the temperature?");
        int temp = reader.nextInt();





        //alternetive way that includes &&(AND) and ||(OR):
    if (weather.equals("rainy") && temp <= 10) {
         System.out.println("Wear waterproof winter coat");
    } else if (weather.equals("snowy") || temp <=5) {
         System.out.println("Wear a thick coat");
    } else if (weather.equals("sunny") || temp > 18) {
         System.out.println("wear sunscreen");
     } else if (weather.equals("cloudy") && temp > 18) {
         System.out.println("No sunscreen needed. T-shirts are good");

    }


    }
}

//alternetive way that includes &&(AND) and ||(OR):
//if (weather.equals("rainy") && temp <= 10) {
//     System.out.println("Wear waterproof coat");
//} else if (weather.equals("snowy") || temp <=5) {
//     System.out.println();
//} else if (weather.equals() || temp > 18) {
//     System.out.println("wear sunscreen");
// }