import javax.swing.*;
import java.awt.event.*;

import Task3.Task3app;
import Task4.*;
import Task5.Task5app;


public class MainWindow extends JFrame {

    private JPanel panel;
    private JTextField textField1;
    private JButton Task4;
    private JButton Task3;
    private JButton Task5;
    private JTextPane textPane1;
    private String[] args;


    public MainWindow(String[] args) {
        this.args = args;
        this.getContentPane().add(panel);
        this.Task3.addMouseListener(new MyMouseListenerTask3());
        this.Task4.addMouseListener(new MyMouseListenerTask4());
        this.Task5.addMouseListener(new MyMouseListenerTask5());
        textPane1.setText("Выберите задачу которую вы хотите запустить");

    }


    class MyMouseListenerTask3 extends ButtonsAction {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                Task3app.main(args);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            textPane1.setText(Texts.task3text);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            textPane1.setText("Выберите задачу которую вы хотите запустить");
        }
    }

    class MyMouseListenerTask4 extends ButtonsAction {

        @Override
        public void mouseClicked(MouseEvent e) {
            Task4app.main(args);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            textPane1.setText(Texts.task4text);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            textPane1.setText("Выберите задачу которую вы хотите запустить");
        }
    }

    class MyMouseListenerTask5 extends ButtonsAction {

        @Override
        public void mouseClicked(MouseEvent e) {
            Task5app.main(args);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            textPane1.setText(Texts.task5text);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            textPane1.setText("Выберите задачу которую вы хотите запустить");
        }
    }


}

