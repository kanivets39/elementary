package Task4;


import javax.swing.*;

public class Task4app {

    public static void main(String[] args) {
        try {

            if (args.length > 0) {
                Connection.autoConnection(args);
            } else {
               Connection.manualConnection();
            }
            System.out.println("Task4 execution finished");
        }catch (NullPointerException e){
            System.out.println("Task4 execution was completed earlier than expected");
        }
    }
}
