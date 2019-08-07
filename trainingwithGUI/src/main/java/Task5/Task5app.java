package Task5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Task5app {

    public static void main(String[] args) {
        long[] number = new long[args.length];// введенное число
        ArrayList<String> numbersList = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                try {
                    number[i] = Long.parseLong(args[i]);
                    numbersList.add("\n" + NumberToText.WordsRus(number[i]));
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input");
                } catch (NumberFormatException e) {
                    System.out.println("No digit was transmitted");
                }
            }
            JOptionPane.showMessageDialog(null, numbersList,
                    "Your numbers", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("All parameters were transferred");
        } else {

            String input;
            String numString = "";
            do {
                input = JOptionPane.showInputDialog("Please enter a number from -999 999 999 999 to 999 999 999 999 ");
                if (input.matches("^[0-9]*$")) {
                    numString = input;
                    System.out.println("Number = " + numString);
                } else {
                    System.out.println("Please enter a number");
                }
            } while (!input.matches("^[0-9]*$"));
            long inNumber = Long.parseLong(numString);
            JOptionPane.showMessageDialog(null, inNumber + " = " + NumberToText.WordsRus(inNumber));
        }
        System.out.println("Task5 execution finished");
    }

}
