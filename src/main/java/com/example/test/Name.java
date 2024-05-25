package com.example.test;

import java.util.Scanner;

public class Name implements WalletName {
    /**
     * getName() saves user's input and assigns it to the Wallet's name, by creating a new scanner and
     * simply saving the name
     */
    @Override
    public void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How do you want to name your wallet?");
        String input = sc.nextLine();
        System.out.println(input + " " + "saved successfully!");
    }

    /**
     * editName() takes the name that was saved before and that was assigned to a wallet before,
     * editing its String value and saving it again
     */
    @Override
    public void editName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the new name:");
        String input = sc.nextLine();
        System.out.println(input + " " + "saved successfully!");
    }

    /**
     * getID() generates a random ID for a wallet, assigning the integer to it and saving it on later
     */
    @Override
    public void getID() {
        int min = 10000;
        int max = 99999;
        int randomID = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Your wallet ID is:" + randomID);
    }

    /**
     * nameMenu() is the menu for options to call methods that are written above, it is non-static and takes
     * in user input, making the menu decision by comparing integers
     */
    public void nameMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, select one of the following options:");
        System.out.println("1) pecunia.Name your wallet");
        System.out.println("2) Edit wallet's name");
        System.out.println("3) See your wallet ID");
        int input = sc.nextInt();
        if (input == 1){
            getName();
        }
        else if (input == 2){
            editName();
        }
        else if (input == 3){
            getID();
        }
    }
}
