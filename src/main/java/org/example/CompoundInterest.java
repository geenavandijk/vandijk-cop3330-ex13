/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        float principal, rate;
        int years, n;

        System.out.printf("What is the principal amount? ");

        principal = input.nextFloat();

        System.out.printf("What is the rate? ");

        rate = input.nextFloat();

        System.out.printf("What is the number of years? ");

        years = input.nextInt();

        System.out.printf("What is the number of times the interest is compounded per year?  ");

        n = input.nextInt();

        float worth = (float) (principal * Math.pow(1 +(rate/100/n),(n*years)));

        df.setRoundingMode(RoundingMode.UP);

        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $"+df.format(worth),principal,rate, years, n);






    }
}