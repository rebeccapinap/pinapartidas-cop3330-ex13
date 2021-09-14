package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Calculates compound interest with user input
        System.out.print("What is the principal amount? ");
        double principal = input.nextDouble();

        System.out.print("What is the rate? ");
        double interest = input.nextDouble();

        System.out.print("What is the number of years? ");
        double years = input.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year? ");
        double timesCompounded = input.nextDouble();

        double total = principal * Math.pow((1 + ((interest / 100) / timesCompounded)), (timesCompounded * years));

        System.out.format("$%.0f invested at %.1f%% for %.0f years compounded %.0f times per year is $%.2f.", principal, interest, years, timesCompounded, total);
    }
}
