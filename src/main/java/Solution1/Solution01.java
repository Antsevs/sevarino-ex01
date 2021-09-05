/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/* Program Start
 * Establish input Scanner
 * Establish variable for input
 * Ask user "What is your name?"
 * Take user input
 * Tell user "Hello, name, nice to meet you!
 */

package Solution1;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = myObj.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}


