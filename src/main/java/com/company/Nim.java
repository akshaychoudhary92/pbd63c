package com.company;

import java.util.Scanner;

public class Nim {
    public void letsPlayNim(){
        Scanner s = new Scanner(System.in);
        String Player1;
        String Player2;

        int a = 3;
        int b = 4;
        int c = 5;

        String pileChoice;
        int removeFromPile;

        System.out.println("Player 1, enter your name: ");
        Player1 = s.nextLine();
        System.out.println("Player 2, enter your name: ");
        Player2 = s.nextLine();


        while(a != 0 && b != 0 && c != 0){
            System.out.println("\"A\": " + a + " \"B\": " + b + " \"C\": " + c);
//            break;
            System.out.println(Player1 + ", choose a pile:");
            pileChoice = s.nextLine();

            System.out.println("How many to remove from pile " + pileChoice + ":");
            removeFromPile = s.nextInt();
//            break;
            if(pileChoice.equalsIgnoreCase("c")){
                c = c - removeFromPile;
                s.nextLine();

            }else if(pileChoice.equalsIgnoreCase("b")){
                b = b - removeFromPile;
                s.nextLine();
            }else if(pileChoice.equalsIgnoreCase("a")){
                a = a - removeFromPile;
                s.nextLine();
            }
            System.out.println("\"A\": " + a + " \"B\": " + b + " \"C\": " + c);
            break;
        };



    }
}
