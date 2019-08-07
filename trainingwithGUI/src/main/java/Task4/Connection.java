package Task4;

import javax.swing.*;

class Connection {

    static void autoConnection(String[] args){

        FileService myfile = new FileService(args);
        JOptionPane.showMessageDialog(null, myfile.fileoutput(),
                "Current file data", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, myfile.countering(),
                "Reiteration of - " + myfile.requiredString, JOptionPane.PLAIN_MESSAGE);
        myfile.replaceLinesV2();
        JOptionPane.showMessageDialog(null, myfile.fileoutput(),
                "Current file data", JOptionPane.PLAIN_MESSAGE);
    }

   static void manualConnection() {
       String requiredString = JOptionPane.showInputDialog("Please enter the line you want to count or replace");
        String toReplace = JOptionPane.showInputDialog("Please enter the line which you want to replace the previous one");
        FileService myfile = new FileService(requiredString);
        JOptionPane.showMessageDialog(null, myfile.fileoutput(),
                "Current file data", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, myfile.countering(),
                "Reiteration of - " + myfile.requiredString, JOptionPane.PLAIN_MESSAGE);
        System.out.println(toReplace);
        if (!toReplace.equals("")) {
            myfile.replaceLinesV2(toReplace);
        }
        JOptionPane.showMessageDialog(null, myfile.fileoutput(),
                "Current file data", JOptionPane.PLAIN_MESSAGE);
    }

}
