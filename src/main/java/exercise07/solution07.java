/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Isaac Lynch
 */
package exercise07;

import java.util.Scanner;
import java.text.DecimalFormat;

public class solution07 {

    private static DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("What is the length of the room in feet?");
            double l = sc.nextDouble();
            System.out.print("What is the width of the room in feet?");
            double w = sc.nextDouble();
            System.out.println("You entered dimension of "+ l +" by "+ w +" feet.");


            double a = l*w;
            final double finalAnswer = a*0.09290304;

            System.out.println("The area is:");
            System.out.println(a +" square feet.");
            System.out.println(df.format(finalAnswer) +" square meters.");
        }
    }
/* psuedocode: (had to rewrite this bc im a perfectionist :pensive:) first thing is to
import both the java scanner functions and the java decimal functions. after that, the
decimalformat function is called into a private static field and is set so that the final
answer is rounded up to three decimal points. after that an instance of the scanner
function is made and we go directly into the outputs made by the code. the code then
reads the users inputs and saves them in "l" for length and "w" for width. all of these
values are stored into a double so that the final answer can actually have decimal points.
the area is also stored into a double called "a" which is then used for the finalAnswer by
multiplying it by "0.09290304" to get the area of the room in square meters. the code then
outputs both the area in square feet and square meters.
 */