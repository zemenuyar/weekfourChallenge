package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static ArrayList<String> words = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here


        //declaring array lists


        //adding a values to array list
        words.add("snow");
        words.add("cloudy");
        words.add("rainy");
        words.add("sunny");
        words.add("foggy");

        //Randomly selected string  from the array list
        Random rand = new Random();
        int index = rand.nextInt(words.size()-1);
        String words5 = words.get(index);
//        System.out.println("\n you should select " + words5 +
//                " now!");

        //getting input
        Scanner in = new Scanner(System.in);
        String userInput = "";
        do {

//            int index = rand.nextInt(words.size()-1);
//            String words5 = words.get(index);
//
            System.out.println("Enter the temp: ");
            double temp = in.nextDouble();
            if(temp>50){
                System.out.println("Nice weather " );
            }else{
                System.out.println("It's " + words5);
            }
            System.out.println("Do you want to continue? Type no to quit: ");
             userInput = in.next();
        }while (!userInput.equalsIgnoreCase("no"));

    }

}
