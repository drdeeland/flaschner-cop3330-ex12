/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String principalString = myApp.principalInput();
        String roiString = myApp.roiInput();
        String yearString = myApp.yearInput();

        int principal = Integer.parseInt(principalString);
        float roi = Float.parseFloat(roiString);
        int year = Integer.parseInt(yearString);

        float investment = myApp.investCalc(principal, roi, year);

        String output = myApp.buildOutput(yearString, roiString, investment);

        myApp.printOutput(output);
    }

    public String principalInput() {
        System.out.print("Enter the principal: ");
        return input.nextLine();
    }

    public String roiInput() {
        System.out.print("Enter the rate of interest (as a percent value): ");
        return input.nextLine();
    }

    public String yearInput() {
        System.out.print("Enter the number of years: ");
        return input.nextLine();
    }

    public float investCalc(int principal, float roi, int year) {
        roi /= 100;
        return principal * (1 + (roi * year));
    }

    public String buildOutput(String yearString, String roiString, float investment) {
        String investmentString = String.format("$%.2f", investment);
        return "After " + yearString + " years at " + roiString + "%, the investment will be worth " + investmentString + ".";
    }

    public void printOutput(String output) {
        System.out.print(output);
    }
}
