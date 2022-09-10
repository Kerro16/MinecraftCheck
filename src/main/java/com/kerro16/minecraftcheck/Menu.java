package com.kerro16.minecraftcheck;

public class Menu {
    UserInputs userInputs = new UserInputs();
    Server server = new Server();
    public void showmenu() {
            userInputs.setOption(userInputs.inputs());

            switch (userInputs.getOption()) {
                case "1":
                    System.out.println("\n"+server.isOnline("1"));
                    break;
                case "2":
                    System.out.println("\n"+server.isOnline("2"));
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select a valid option");

            }
    }
}