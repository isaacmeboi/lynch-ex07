/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Isaac Lynch
 */
package exercise07;

import java.util.Scanner;

public class solution07 {
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
            System.out.println(finalAnswer +" square meters.");
        }
    }
/* psuedocode: first, as per usual, the java.util.scanner function is imported.
after that an instance of the scanner function is made and then program prints
out the first prompt for the user to answer. the length is stored into a double
named "l" and then the width is also stored into a double named "w". the area of
the two number (length * width) is saved into a double integer called "a". this
value is used to calculate the final double by multiplying it wih the number
"0.09290304", this is the really important one to be a double so that the final
answer has the correct decimal points after the whole number. this final number
is stored in a double called "finalAnswer". finally, the code outputs the answers
to the user.
 */