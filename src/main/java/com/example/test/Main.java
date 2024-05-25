package com.example.test;

/**
 * NAMEs: Yurii Bezborodov (30114669), Tamerlan Ormanbayev (30141208)
 * TUTORIALs: T07, T03
 * DATE: 18th MARCH 2022
 *

public class Main {

    public static ArrayList<Object[]> TransactionsData = new ArrayList<>(); // global ArrayList which stores all
    // transactions

    /**
     * main() of the class, scans input and calls functions depending on what the user input is.
     *
     * @param args

    public static void main(String[] args) throws IOException {
        Name menu = new Name();
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Load wallet from a file\n");
        System.out.println("2)Reset data and create a new wallet");
        int loadchoice = sc.nextInt();
        if (args.length > 0){
            if (loadchoice == 1){
                try {
                    String wallet = args[0];
                    Scanner filescanner = new Scanner(new FileInputStream(args[0]));
                    TransactionsData = CSVReader.CSV(args[0], filescanner);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else if (loadchoice == 2){
                TransactionsData.clear();
                WriterCSV.CSVW();
            }
        }
        else {
            if (loadchoice == 1){
                try {
                    String wallet = "CSVDemo2.csv";
                    Scanner filescanner = new Scanner(new FileInputStream(wallet));
                    TransactionsData = CSVReader.CSV(wallet, filescanner);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else if (loadchoice == 2){
                TransactionsData.clear();
                WriterCSV.CSVW();
            }
        }
        Menu.mainMenu();
        int SelectedOption = sc.nextInt();
        while (SelectedOption != 0) {
            if (SelectedOption == 1) {
                Transaction.TransactionInput();

            } else if (SelectedOption == 2) {
                Transaction.EditTransaction();

            } else if (SelectedOption == 3) {
                Transaction.PrintAllTransactions();
                System.out.println(MenuHelp.main());
                int exit = sc.nextInt();
                if (exit == 0) {
                    Menu.mainMenu();
                }
            } else if (SelectedOption == 4) {
                Statistics.Statistics();
                System.out.println(MenuHelp.main());
                int exit = sc.nextInt();
                if (exit == 0) {
                    Menu.mainMenu();
                }
            } else if (SelectedOption == 5) {
                WriterCSV.CSVW();
                System.out.println("Changes saved successfully!\n");
                System.out.println(MenuHelp.main());
                int exit = sc.nextInt();
                if (exit == 0) {
                    Menu.mainMenu();
                }
            } else if (SelectedOption == 6) {
                menu.nameMenu();
                System.out.println(MenuHelp.main());
                int exit = sc.nextInt();
                if (exit == 0){
                    Menu.mainMenu();
                }
            }
            SelectedOption = sc.nextInt();
        }
    }
}

*/