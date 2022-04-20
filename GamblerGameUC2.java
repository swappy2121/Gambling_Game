package com.company;
import java.util.Scanner;



public class GamblerGameUC2 {

    public static void main(String[] args) {
        int Stake = 100;
        int Bet = 1;
        System.out.println("the stakeholder should bet per day: " + Stake + "$");
        System.out.println("the bet for one game :" + Bet + "$");

        System.out.println("take input from user : ");
        Scanner sc = new Scanner(System.in);
        int bet = sc.nextInt();

        if (bet == 1) {
            System.out.println("the gambler win the game");
        } else {
            System.out.println("the gambler loose the game");
        }
    }
}
