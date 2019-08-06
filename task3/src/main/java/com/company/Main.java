package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        ArrayList<Triangle> triangleList = new ArrayList<>();
        String answer = "y";

        do {
            System.out.println("Please enter the triangle data as follows.\n" +
                    "<name>, <side1>, <side2>, <side3>");
            triangleList.add(triangleCreator(input()));
            System.out.println("Do you want to input one more triangle?(y/yes)");
            answer = in.nextLine();
        } while ((answer.compareToIgnoreCase("y") == 0) | (answer.compareToIgnoreCase("yes") == 0));

        triangleList.sort(new TriangleSquareComparator());

        for (Triangle triangle : triangleList) System.out.println(triangle.toString());

    }

    private static String[] input() {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        String[] strings;
        strings = line.split(",");

        return strings;
    }

    private static Triangle triangleCreator(String[] strings) {

        Triangle tr = new Triangle();
        try {
            tr = new Triangle(strings[0], Double.parseDouble(strings[1]),
                    Double.parseDouble(strings[2]), Double.parseDouble(strings[3]));
            return tr;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not all fields were filled");
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
        }
        return tr;
    }
}
