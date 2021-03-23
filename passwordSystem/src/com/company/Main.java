package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables

        String passwd = "12345"; // change this to change the password
        String wrongPassword = "Password is Incorrect";
        String welcome = "Welcome";
        int maxNumberOfTries = 3; // change this to increase or decrease the max number of tries
        int currentNumOfTries = 0;

        // While loop

        while (true && currentNumOfTries < maxNumberOfTries) {
            System.out.print("Password: ");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            if (userInput.equals(passwd)) {
                System.out.println(welcome);
                break;
            }
            else if (!userInput.equals(passwd)) {
                System.out.println(wrongPassword);
                currentNumOfTries += 1;
            }
        }

        if (currentNumOfTries == maxNumberOfTries) {
            System.out.println("Max number of tries reached");
        }

    }
}
