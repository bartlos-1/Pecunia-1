package com.example.test;

public class Menu {

    public static void mainMenu(){
        printHeader();
        printMenu();
    }

    /**
     * PrintHeader() prints out this nice looking welcoming letter in a box, as soon
     * as the program is launched, without asking for any input.
     */
    public static void printHeader(){
        System.out.print("+-----------------------------------+\n");
        System.out.print("|        Welcome to the pecunia.Menu        |\n");
        System.out.print("|      Please select an option      |\n");
        System.out.print("+-----------------------------------+\n");
    }

    /**
     *  PrintMenu() gives user a clear message of the current state of the menu, giving
     *  out options to choose to add or view data.
     *  This was made as another function and not part of PrintHeader because we are later going
     *  to ask this function separately in order of the program to work.
     */
    public static void printMenu(){
        System.out.print("Please make a selection: \n");
        System.out.print("1) Add a transaction\n");
        System.out.print("2) Edit a transaction\n");
        System.out.println("3) View all transactions\n");
        System.out.println("4) View statistics\n");
        System.out.println("5) Save changes\n");
        System.out.println("6) Wallet settings\n");
        System.out.print("0) Exit\n");
    }

}

