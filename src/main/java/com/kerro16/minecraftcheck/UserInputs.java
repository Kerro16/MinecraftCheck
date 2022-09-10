package com.kerro16.minecraftcheck;

import java.util.Scanner;
public class UserInputs {
    Scanner sc = new Scanner(System.in);
    public void setOption(String option) {
        this.option = option;
    }
    public String getOption() {
        return option;
    }
    String option;
    public void msg(){
        System.out.println("\nSelect an option:\nPress 1 for local connection\nPress 2 for external connection\nPress 3 to exit");
    }
    public String inputs(){
        msg();
        option = sc.nextLine();
        return option;
    }
}
