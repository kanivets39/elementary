package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Chessboard chessboard = input(args);
        chessPrinter(chessboard.getHeight(), chessboard.getWidth());
    }

    private static Chessboard input(String[] args) {
        Chessboard chessboard = new Chessboard();

        if (args.length > 0) {

            try {
                chessboard.setHeight(Integer.parseInt(args[0]));
                chessboard.setWidth(Integer.parseInt(args[1]));
                System.out.println("All parameters have been transferred");
            } catch (NumberFormatException e) {
                System.out.println("Incorrectly parameters");
            }


        } else {
            System.out.println("Parameters have not been transferred, but you can enter them manually");
            System.out.print("Enter Height for your chessboard: ");
            chessboard.setHeight(keyboardinput());
            System.out.print("Enter Wight for your chessboard: ");
            chessboard.setWidth(keyboardinput());
        }

        return chessboard;
    }

    private static int keyboardinput() {
        int num;
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("You must enter numbers here!");
            in.next(); // this is important!
        }
        num = in.nextInt();
        if (num < 0) {
            System.out.println("You entered a negative value but everything is OK)");
            num = -num;
        }

        return num;
    }

    private static void chessPrinter(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if ((i + j) % 2 == 0)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            System.out.println();
        }
    }
}


