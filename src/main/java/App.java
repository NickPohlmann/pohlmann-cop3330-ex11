/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;
import java.lang.Math;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String euroString = myApp.readInput("How many euros are you exchanging? ");
        String exchangeRateString = myApp.readInput("What is the exchange rate? ");
        double euro = myApp.convertInputString(euroString);
        double exchangeRate = myApp.convertInputString(exchangeRateString);
        double usDollars = myApp.computeUSDollars(euro, exchangeRate);
        String outputString = myApp.generateOutputString(euro, exchangeRate, usDollars);
        myApp.printOutputString(outputString);
    }

    private void printOutputString(String outputString) {
        System.out.println(outputString);
    }

    private String generateOutputString(double euro, double exchangeRate, double usDollars) {
        return String.format("%.2f euros at an exchange rate of %f is\n%.2f U.S. dollars.", euro, exchangeRate, usDollars);
    }

    private double computeUSDollars(double euro, double exchangeRate) {
        double usDollars = euro * exchangeRate;
        usDollars= (Math.floor(usDollars * 100.0))/100.0;
        return usDollars;
    }

    private String readInput(String str) {
        System.out.print(str);
        String input = in.nextLine();
        return input;
    }

    private double convertInputString(String inputString) {
        double input = Double.parseDouble(inputString);
        return input;
    }
}
