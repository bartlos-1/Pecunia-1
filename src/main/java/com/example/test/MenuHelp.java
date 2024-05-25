package com.example.test;

public class MenuHelp {

    public static String main;

    enum MenuAssist{
        GO, DONT;
    }

    /**
     * main() works with the assigned enum values, later passing on variables t and o in return, and is needed
     * for completion of the enum
     * @return
     */
    public static String main(){
        MenuAssist option = MenuAssist.GO;
        String t = "Enter '0' to go back to the pecunia.Main pecunia.Menu";
        String o = "";
        if (option == MenuAssist.GO){
            System.out.println(t);
        }
        else if (option == MenuAssist.DONT){
            System.out.println(t);
        }
        return o;
    }
}
