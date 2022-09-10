package com.kerro16.minecraftcheck;

import java.io.IOException;
public class Main {

    public static void clearConsole() throws IOException, InterruptedException {

        final String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else
            Runtime.getRuntime().exec("clear");
    }
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu menu = new Menu();

        do {
            clearConsole();
            menu.showmenu();
        }
        while ( menu.userInputs.getOption() != "3");
        System.out.println(menu.userInputs.getOption());
    }
}
