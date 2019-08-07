package Task3;

import javax.swing.*;
import java.util.ArrayList;

public class Task3app {

    public static void main(String[] args) {

        try {
        ArrayList<Triangle> triangleList = new ArrayList<>();
        String answer = "y";

        do {
            triangleList.add(triangleCreator(input()));

            answer = JOptionPane.showInputDialog("Do you want to input one more triangle?(y/yes)");
        } while ((answer.compareToIgnoreCase("y") == 0) | (answer.compareToIgnoreCase("yes") == 0));

        triangleList.sort(new TriangleSquareComparator());
        JOptionPane.showMessageDialog(null, triangleList, "Your triangles list", JOptionPane.INFORMATION_MESSAGE);

            System.out.println("Task3 execution finished");
    }catch (NullPointerException e){
        System.out.println("Task3 execution was completed earlier than expected");
    }


    }


    private static String[] input() {
        String line = JOptionPane.showInputDialog("Please enter the triangle data as follows.\n" +
                "<name>, <side1>, <side2>, <side3>");

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
