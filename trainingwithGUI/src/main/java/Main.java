import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow(args);
        mainWindow.pack();
        mainWindow.setSize(new Dimension(600, 450));
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);
    }
}
