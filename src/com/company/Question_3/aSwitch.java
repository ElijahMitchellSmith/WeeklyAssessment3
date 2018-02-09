package com.company.Question_3;

import java.util.Scanner;

public class aSwitch {
    private Scanner input = new Scanner(System.in);
    private String day;

    public void switchMenu() {


        System.out.println("What animal would you like to be?\n1.Cat\n2.Dog\n3.Hamster\n4.Tyrannosaurus Rex!");

        switch (input.nextInt()) {
            case 1:
                System.out.println("You are now a Cat...Hooray!");
                break;
            case 2:
                System.out.println("You are now a Dog...Hooray!");
                break;
            case 3:
                System.out.println("You are now a Hamster...Hooray!");
                break;
            case 4:
                System.out.println("Wait are you serious!? Do you understand how awesome you are !? You are the king/queen of the Cretaceous period! YOU ARE A TYRANNOSAURUS REX!");
                break;
            default:
                System.out.println("Pick an animal please!");
                switchMenu();


        }
    }


}
