/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Isaac Lynch
 */
package exercise07;

import java.util.Scanner;
import java.text.DecimalFormat;

class Dimensions {

    private static DecimalFormat df = new DecimalFormat("0.00");

    double length;
    double width;

    public void scn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the length of the room in feet?");
        double length = sc.nextDouble();
        System.out.print("What is the width of the room in feet?");
        double width = sc.nextDouble();
        System.out.println("You entered dimension of "+ length +" by "+ width +" feet.");
    }

    public void prt() {
        double a = length*width;
        final double finalAnswer = a*0.09290304;

        System.out.println("The area is:");
        System.out.println(a +" square feet.");
        System.out.println(df.format(finalAnswer) +" square meters.");
    }
}
public class solution07 {
    public static void main(String[] args) {

        Dimensions ca = new Dimensions();
        ca.scn();
        ca.prt();
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

edit: had to rewrite it again lol. put all of the functions into their own separate public
voids so that the entire program wasn't running in the main.
 */