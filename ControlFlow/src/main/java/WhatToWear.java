import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {
        System.out.println("Wondering what to wear today? What is the weather like?");
        System.out.println("Cloudy, rainy, sunny or snowy?");


        Scanner reader = new Scanner(System.in);

        String weather = reader.nextLine();
        System.out.println("what is the temperature?");
        int temp = reader.nextInt();





        if (weather.equals("rainy")) {
            if (temp < 12) {
                System.out.println("Wear a waterproof winter coat, its cold and wet!");
            }
            else {
                System.out.println("Wet but not cold. An umbrella should suffice!");
            }
        }
        else if(weather.equals(("cloudy"))){
            if (temp < 14){System.out.println("Wear a coat, theres no sun to warm you!");}
            else {
                System.out.println("No coat needed, but I wish it was sunny :(");
            }
        }
        else if(weather.equals(("sunny"))){
            if (temp < 13){System.out.println("Sunny AND cold? Bummer. Time to get your coat.");}
            else if (temp <= 16){
                System.out.println("No coat needed, its a nice day!");
            }
            else {
                System.out.println("T-shirt weather, amazing! Wear your best colours!");
            }
        }
        else if (weather.equals("snowy")) {
                System.out.println("Wear gloves, a hat and a THICK coat. BRRR!");
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