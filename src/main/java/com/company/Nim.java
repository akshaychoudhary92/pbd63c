package com.company;

import java.util.Scanner;

public class Nim {
    public void letsPlayNim(){
        Scanner s = new Scanner(System.in);
        String player1;
        String player2;

        int a = 3;
        int b = 4;
        int c = 5;

        int player1Turn = 0;
        int player2Turn = 0;

        String pileChoice;
        int removeFromPile;

        System.out.println("Player 1, enter your name: ");
        player1 = s.nextLine();
        System.out.println("Player 2, enter your name: ");
        player2 = s.nextLine();


        while(true){
            System.out.println("\"A\": " + a + " \"B\": " + b + " \"C\": " + c);
//            break;
            System.out.println(player1 + ", choose a pile:");
            pileChoice = s.nextLine();

            do {
                if(!pileChoice.equalsIgnoreCase("a") || !pileChoice.equalsIgnoreCase("b") || !pileChoice.equalsIgnoreCase("c")){
                    System.out.println("you have to pick from pile a b or c nothing else!!! Choose a pile:");
                    pileChoice= s.nextLine();
                }
                if (pileChoice.equalsIgnoreCase("a") && a == 0) {
                    System.out.println("Nice try, " + player1 + ". That pile is empty. Choose again:");
                    pileChoice = s.nextLine();
                } else if (pileChoice.equalsIgnoreCase("b") && b == 0) {
                    System.out.println("Nice try, " + player1 + ". That pile is empty. Choose again:");
                    pileChoice = s.nextLine();
                } else if (pileChoice.equalsIgnoreCase("c") && c == 0) {
                    System.out.println("Nice try, " + player1 + ". That pile is empty. Choose again:");
                    pileChoice = s.nextLine();
                }
            }while(pileChoice.equalsIgnoreCase("a") && a == 0
            || pileChoice.equalsIgnoreCase("b") && b == 0
                    || pileChoice.equalsIgnoreCase("c") && c == 0 &&
                    !pileChoice.equalsIgnoreCase("b") && !pileChoice.equalsIgnoreCase("a") &&
                    !pileChoice.equalsIgnoreCase("c")
            );
            System.out.println("How many to remove from pile " + pileChoice + ":");
            removeFromPile = s.nextInt();
            do {
                if(removeFromPile <= 0){
                    System.out.println("You must choose atleast one. Choose again:");
                    removeFromPile = s.nextInt();
                }
                if (removeFromPile > a && pileChoice.equalsIgnoreCase("a")) {
                    System.out.println("Pile " + pileChoice + " doesn't have that many. Try again:");
                    removeFromPile = s.nextInt();

                }else if(removeFromPile > b && pileChoice.equalsIgnoreCase("b")) {
                    System.out.println("Pile " + pileChoice + " doesn't have that many. Try again:");
                    removeFromPile = s.nextInt();
                }else if(removeFromPile > c && pileChoice.equalsIgnoreCase("c")) {
                    System.out.println("Pile " + pileChoice + " doesn't have that many. Try again:");
                    removeFromPile = s.nextInt();
                }
            }while(removeFromPile > a && pileChoice.equalsIgnoreCase("a")
            || removeFromPile > b && pileChoice.equalsIgnoreCase("b") ||
                    removeFromPile > c && pileChoice.equalsIgnoreCase("c") ||
                    removeFromPile <= 0

            );
//            break;
            if(pileChoice.equalsIgnoreCase("c")){
                c = c - removeFromPile;
                player1Turn++;
                s.nextLine();

            }else if(pileChoice.equalsIgnoreCase("b")){
                b = b - removeFromPile;
                player1Turn++;
                s.nextLine();
            }else if(pileChoice.equalsIgnoreCase("a")){
                a = a - removeFromPile;
                player1Turn++;
                s.nextLine();
            }
            System.out.println("\"A\": " + a + " \"B\": " + b + " \"C\": " + c);
//            break;

            if(a == 0 && b == 0 && c == 0){
                break;
            }

            //------------------------------------------------------------------------------------------------------------
            //---------------------
            //------------------------------------
            //--------------------------------------

            System.out.println(player2 + ", choose a pile:");
            pileChoice = s.nextLine();
            do {
                if(!pileChoice.equalsIgnoreCase("a") || !pileChoice.equalsIgnoreCase("b") || !pileChoice.equalsIgnoreCase("c")){
                    System.out.println("you have to pick from pile a b or c nothing else!!! Choose a pile:");
                    pileChoice= s.nextLine();
                }
                if (pileChoice.equalsIgnoreCase("a") && a == 0) {
                    System.out.println("Nice try, " + player2 + ". That pile is empty. Choose again:");
                    pileChoice = s.nextLine();
                } else if (pileChoice.equalsIgnoreCase("b") && b == 0) {
                    System.out.println("Nice try, " + player2 + ". That pile is empty. Choose again:");
                    pileChoice = s.nextLine();
                } else if (pileChoice.equalsIgnoreCase("c") && c == 0) {
                    System.out.println("Nice try, " + player2 + ". That pile is empty. Choose again:");
                    pileChoice = s.nextLine();
                }
            }while(pileChoice.equalsIgnoreCase("a") && a == 0
                    || pileChoice.equalsIgnoreCase("b") && b == 0
                    || pileChoice.equalsIgnoreCase("c") && c == 0 &&
                    !pileChoice.equalsIgnoreCase("b") && !pileChoice.equalsIgnoreCase("a") &&
                    !pileChoice.equalsIgnoreCase("c")

            );

            System.out.println("How many to remove from pile " + pileChoice + ":");
            removeFromPile = s.nextInt();
            do {
                if(removeFromPile <= 0){
                    System.out.println("You must choose atleast one. Choose again:");
                    removeFromPile = s.nextInt();
                }
                if (removeFromPile > a && pileChoice.equalsIgnoreCase("a")) {
                    System.out.println("Pile " + pileChoice + " doesn't have that many. Try again:");
                    removeFromPile = s.nextInt();
                }else if(removeFromPile > b && pileChoice.equalsIgnoreCase("b")) {
                    System.out.println("Pile " + pileChoice + " doesn't have that many. Try again:");
                    removeFromPile = s.nextInt();
                }else if(removeFromPile > c && pileChoice.equalsIgnoreCase("c")) {
                    System.out.println("Pile " + pileChoice + " doesn't have that many. Try again:");
                    removeFromPile = s.nextInt();
                }
            }while(removeFromPile > a && pileChoice.equalsIgnoreCase("a")
                    || removeFromPile > b && pileChoice.equalsIgnoreCase("b") ||
                    removeFromPile > c && pileChoice.equalsIgnoreCase("c") ||
                    removeFromPile <= 0

            );
//            break;
            if(pileChoice.equalsIgnoreCase("c")){
                c = c - removeFromPile;
                player2Turn++;
                s.nextLine();

            }else if(pileChoice.equalsIgnoreCase("b")){
                b = b - removeFromPile;
                player2Turn++;
                s.nextLine();
            }else if(pileChoice.equalsIgnoreCase("a")){
                a = a - removeFromPile;
                player2Turn++;
                s.nextLine();
            }

            if(a == 0 && b == 0 && c == 0){
                break;
            }

        }

        if(player1Turn > player2Turn){
            System.out.println(player2 + ", there are no counters left, so you WIN!!");
        }else{
            System.out.println(player1 + ", there are no counters left, so you WIN!!");
        }





    }
}
